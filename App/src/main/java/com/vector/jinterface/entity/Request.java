package com.vector.jinterface.entity;

import java.util.Map;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/25
 * Description:<p>{TODO: 用一句话描述}
 */
public class Request {

    public static final String METHOD_GET = "get";
    public static final String METHOD_POST = "post";

    private String url;
    private String method = METHOD_GET;
    private Map<String,String> param;
    private RequestFile[] file;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public RequestFile[] getFile() {
        return file;
    }

    public void setFile(RequestFile[] file) {
        this.file = file;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }
}
