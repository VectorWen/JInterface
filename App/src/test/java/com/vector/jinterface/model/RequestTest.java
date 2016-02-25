package com.vector.jinterface.model;

import com.vector.library.logger.Logger;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/25
 * Description:<p>{TODO: 用一句话描述}
 */
public class RequestTest {

    @Test
    public void testField() throws IllegalAccessException {
        Request request = new Request();
        Field[] fs = request.getClass().getDeclaredFields();
        for(Field f : fs){
            Logger.d(f.getName());
            Logger.d(f.getType().isAssignableFrom(Map.class)+"");
            f.setAccessible(true);
        }
        Logger.d(request.getUrl());
    }

}
