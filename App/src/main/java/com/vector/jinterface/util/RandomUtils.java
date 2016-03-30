package com.vector.jinterface.util;

/**
 * author: vector.huang
 * date：2016/3/30 16:16
 */
public class RandomUtils {

    public static int getRandom(int start,int end){
        int random = (int) (start + Math.random()*(end-start+1));
        return random;
    }

}
