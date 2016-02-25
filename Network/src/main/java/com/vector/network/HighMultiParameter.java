package com.vector.network;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Headers;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/25
 * Description:<p>{TODO: 用一句话描述}
 */
public class HighMultiParameter extends HighParameter {

    private MultipartBody.Builder mMultipartBuilder;

    public HighMultiParameter(){
        mMultipartBuilder = new MultipartBody.Builder();
        mMultipartBuilder.setType(MultipartBody.FORM);
    }

    @Override
    RequestBody getRequestBody() {
        return mMultipartBuilder.build();
    }

    public void addFile(String key,String filename,String pathname){
        Headers headers = new Headers.Builder().add("Content-Disposition",
                "form-data; name=\""+key+"\"; filename=\""+filename+"\"").build();
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/octet-stream"),
                new File(pathname));
        mMultipartBuilder.addPart(headers,requestBody);
    }

    /**
     * image/png -- png
     * image/jpeg -- jpg
     * image/gif -- gif
     * @param key
     * @param filename
     * @param filepath
     */
    public void addImage(String key,String filename,String filepath){
        Headers headers = new Headers.Builder().add("Content-Disposition",
                "form-data; name=\""+key+"\"; filename=\""+filename+"\"").build();
        RequestBody requestBody = RequestBody.create(MediaType.parse("image/png"),
                new File(filepath));
        mMultipartBuilder.addPart(headers,requestBody);
    }


    public void addParameter(String key,String value){
        Headers headers = new Headers.Builder().add("Content-Disposition",
                "form-data; name=\""+key+"\"").build();
        RequestBody requestBody = RequestBody.create(null,value);
        mMultipartBuilder.addPart(headers,requestBody);
    }
}
