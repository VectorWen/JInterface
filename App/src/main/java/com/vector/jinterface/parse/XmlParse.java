package com.vector.jinterface.parse;

import com.vector.jinterface.model.Request;
import com.vector.jinterface.model.Requests;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/25
 * Description:<p>{TODO: 用一句话描述}
 */
public class XmlParse {

    public Requests parse(String xmlPath) throws DocumentException {
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
            String url = requestNode.element("url").getText().trim();
            request.setUrl(url);
            requestList.add(request);
        }
        requests.setRequests(requestList);

        Element rootPath = requestsNode.element("rootPath");
        requests.setRootPath(rootPath.getText().trim());
        return requests;
    }

}
