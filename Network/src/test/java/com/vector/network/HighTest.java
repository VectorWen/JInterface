package com.vector.network;

import com.vector.library.logger.Logger;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/25
 * Description:<p>{TODO: 用一句话描述}
 */
public class HighTest {

    public static void main(String[] args) {
        High high = new High();
        high.get("http://127.0.0.1:8080/server/api/gossip/public/test?test=ssssss我是中国人", new Callback() {
            public void onFailure(Call call, IOException e) {
            }
            public void onResponse(Call call, Response response) throws IOException {
                Logger.d(response.body().string());
            }
        });
    }

}
