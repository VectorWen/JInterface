package com.vector.jinterface.util;

import com.vector.jinterface.db.constant.Constants;

import org.junit.Test;

/**
 * author: vector.huang
 * date：2016/3/30 16:33
 */
public class RandomUtilsTest {

    @Test
    public void testRandom() {
        for(int i = 0;i<100;i++){

            int j = RandomUtils.getRandom(Constants.CATEGORY_ID_START, Constants.CATEGORY_ID_END);
//            double j = Math.random();
            System.out.println(j);
        }
    }
}
