package com.vector.network;

import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * three high : high-performance,high-scalability,high-reliability
 *
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/24
 * Description:<p>{TODO: 用一句话描述}
 */
public class High {

    private static OkHttpClient mHttpClient;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(10, TimeUnit.SECONDS);
        mHttpClient = builder.build();
    }

    public Call post(String url,HighParameter parameter,Callback callback){
        Request request = new Request.Builder()
                .url(url)
                .header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8")
                .post(parameter.getRequestBody())
                .build();
        Call call = mHttpClient.newCall(request);
        call.enqueue(callback);
        return call;
    }


    public Call get(String url,HighParameter parameter, Callback callback){
        Request request = new Request.Builder()
                .url(url+"?"+parameter.toParameter())
                .header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8")
                .get()
                .build();
        Call call = mHttpClient.newCall(request);
        call.enqueue(callback);
        return call;
    }

    public Call get(String url, Callback callback){
        Request request = new Request.Builder()
                .url(url)
                .header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8")
                .get()
                .build();
        Call call = mHttpClient.newCall(request);
        call.enqueue(callback);
        return call;
    }
}
