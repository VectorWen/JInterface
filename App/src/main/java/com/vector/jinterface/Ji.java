package com.vector.jinterface;

import com.vector.jinterface.model.Request;
import com.vector.jinterface.model.Requests;
import com.vector.jinterface.parse.XmlParse;
import com.vector.library.logger.Logger;
import com.vector.network.High;

import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import sun.rmi.runtime.Log;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/24
 * Description:<p>{TODO: 用一句话描述}
 */
public class Ji {

    public static void main(String[] args) throws DocumentException {
        XmlParse xmlParse = new XmlParse();
        Requests requests = xmlParse.parse(xmlParse.getClass().getResource("/interface.xml").getFile().substring(1));
        List<Request> requestList = requests.getRequests();
        High high = new High();

        for (Request request: requestList){
            String url = request.getUrl();
            if(requests.getRootPath()!=null&&!requests.getRootPath().isEmpty()){
                url = requests.getRootPath()+url;
            }
            Logger.d(url);
            high.get(url, new Callback() {
                public void onFailure(Call call, IOException e) {

                }
                public void onResponse(Call call, Response response) throws IOException {
                    Logger.d(response.body().string());
                }
            });
        }
    }
}
