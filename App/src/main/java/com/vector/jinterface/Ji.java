package com.vector.jinterface;

import com.vector.jinterface.model.Request;
import com.vector.jinterface.model.RequestFile;
import com.vector.jinterface.model.Requests;
import com.vector.jinterface.parse.XmlParse;
import com.vector.library.logger.Logger;
import com.vector.network.High;
import com.vector.network.HighMultiParameter;
import com.vector.network.HighParameter;

import org.dom4j.DocumentException;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/24
 * Description:<p>{TODO: 用一句话描述}
 */
public class Ji {

    public static void main(String[] args) throws DocumentException, IllegalAccessException {
        XmlParse xmlParse = new XmlParse();
        Requests requests = xmlParse.parse(xmlParse.getClass().getResource("/interface.xml").getFile().substring(1));
        List<Request> requestList = requests.getRequests();
        High high = new High();

        for (Request request : requestList) {

            //组合url
            String url = request.getUrl();
            if (requests.getRootPath() != null && !requests.getRootPath().isEmpty()) {
                url = requests.getRootPath() + url;
            }
            Logger.d(url);

            HighParameter highParameter = null;

            //判断是否是上传文件
            RequestFile[] files = request.getFile();
            Set<Map.Entry<String, String>> entrySet;

            if (files != null && files.length > 0) {
                HighMultiParameter highMultiParameter = new HighMultiParameter();

                for (RequestFile file : files) {
                    highMultiParameter.addImage(file.getKey(),file.getFilename(),file.getFilepath());
                }

                Map<String, String> param = request.getParam();
                entrySet = param.entrySet();
                for (Map.Entry<String, String> entry : entrySet) {
                   highMultiParameter.addParameter(entry.getKey(),entry.getValue());
                }

                highParameter = highMultiParameter;
            }

            if(highParameter == null){
                highParameter = new HighParameter();
                Map<String, String> param = request.getParam();
                entrySet = param.entrySet();
                for (Map.Entry<String, String> entry : entrySet) {
                    highParameter.add(entry.getKey(), entry.getValue());
                }
            }

            if (request.getMethod().equalsIgnoreCase(Request.METHOD_GET)) {
                high.get(url, highParameter, new Callback() {
                    public void onFailure(Call call, IOException e) {

                    }

                    public void onResponse(Call call, Response response) throws IOException {
                        Logger.d(response.body().string());
                    }
                });
            } else {
                high.post(url, highParameter, new Callback() {
                    public void onFailure(Call call, IOException e) {

                    }

                    public void onResponse(Call call, Response response) throws IOException {
                        Logger.d(response.body().string());
                    }
                });
            }
        }
    }
}
