package com.vector.jinterface;

import org.junit.Assert;
import org.junit.Test;

import rx.Observable;
import rx.functions.Action1;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/24
 * Description:<p>{TODO: 用一句话描述}
 */
public class RxJavaTest {

    @Test
    public void testHelloWorld(){
        Observable.just("Hello World!!")
                .subscribe(new Action1<String>() {
                    public void call(String s) {
                        System.out.println(s);
                        Assert.assertEquals("Hello World!!",s);
                    }
                });
    }

}
