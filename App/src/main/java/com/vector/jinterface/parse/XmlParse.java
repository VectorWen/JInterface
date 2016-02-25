package com.vector.jinterface.parse;

import com.vector.jinterface.model.Request;
import com.vector.jinterface.model.RequestFile;
import com.vector.jinterface.model.Requests;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/25
 * Description:<p>{TODO: 用一句话描述}
 */
public class XmlParse {

    public Requests parse(String xmlPath) throws DocumentException, IllegalAccessException {
        Requests requests = new Requests();
        List<Request> requestList;
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File(xmlPath));
        Element requestsNode = document.getRootElement();

        List<Element> requestNodes = requestsNode.elements("request");
        requestList = new ArrayList<Request>(requestNodes.size());
        Request request;
        for(Element requestNode : requestNodes){
            request = new Request();

            //设置属性
            Field[] fields = request.getClass().getDeclaredFields();
            for(Field field : fields){
                Class fieldCls = field.getType();
                if(fieldCls.isAssignableFrom(String.class)){
                    parseAttributeValue(request,field,requestNode);
                }

                if(fieldCls.isAssignableFrom(String[].class)){
                    parseStrArray(request,field,requestNode);
                }

                if(fieldCls.isAssignableFrom(RequestFile[].class)){
                    parseFileArray(request,field,requestNode);
                }

                if(fieldCls.isAssignableFrom(Map.class)){
                    parseMap(request,field,requestNode);
                }
            }
            requestList.add(request);
        }
        requests.setRequests(requestList);
        requests.setRootPath(requestsNode.attributeValue("rootPath"));
        return requests;
    }

    private void parseFileArray(Object obj, Field field, Element element) throws IllegalAccessException {
        RequestFile[] array;
        String fieldName = field.getName();
        List<Element> childElements = element.elements(fieldName);
        array = new RequestFile[childElements.size()];
        for (int i = 0; i < childElements.size(); i++) {
            Element childElement = childElements.get(i);
            RequestFile file = new RequestFile();
            Field[] fields = file.getClass().getDeclaredFields();
            for(Field childField:fields){
                parseAttributeValue(file,childField,childElement);
            }
            array[i] = file;
        }
        field.setAccessible(true);
        field.set(obj,array);
    }

    private void parseAttributeValue(Object obj, Field field, Element element) throws IllegalAccessException {
        String fieldName = field.getName();
        String fieldValue = element.attributeValue(fieldName);
        if(fieldValue!=null){
            field.setAccessible(true);
            field.set(obj,fieldValue);
        }
    }

    private void parseStrArray(Object obj,Field field,Element element) throws IllegalAccessException {
        String[] array;
        String fieldName = field.getName();
        List<Element> childElements = element.elements(fieldName);
        array = new String[childElements.size()];

        for (int i = 0; i < childElements.size(); i++) {
            String value = childElements.get(i).attributeValue("value");
            array[i] = value;
        }
        field.setAccessible(true);
        field.set(obj,array);
    }

    private void parseMap(Object obj,Field field,Element element) throws IllegalAccessException {
        Map<String,String> map;
        String fieldName = field.getName();
        List<Element> childElements = element.elements(fieldName);
        map = new HashMap<String, String>(childElements.size());
        for(Element chileElement:childElements){
            String key = chileElement.attributeValue("key");
            String value = chileElement.attributeValue("value");
            map.put(key,value);
        }
        field.setAccessible(true);
        field.set(obj,map);
    }

}
