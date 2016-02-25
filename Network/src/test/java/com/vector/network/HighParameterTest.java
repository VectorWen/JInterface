package com.vector.network;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/24
 * Description:<p>{TODO: 用一句话描述}
 */
public class HighParameterTest {

    @Test
    public void testAdd(){
        HighParameter parameter = new HighParameter();
        parameter.add("param","param");
        parameter.add("param2","param2");
        Assert.assertEquals("param=param&param2=param2",parameter.toParameter());
    }

}
