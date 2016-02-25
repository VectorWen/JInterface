package com.vector.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

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
}
