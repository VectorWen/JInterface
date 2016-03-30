package com.vector.jinterface.util;

import java.io.UnsupportedEncodingException;

/**
 * author: vector.huang
 * date：2016/3/30 12:27
 */
public class UnicodeUtils {


    public static char getRandomZHCN(){
        //最小值+Math.random()*(最大值-最小值+1)
        int gbStart = 45217;//(0xB0 << 8) + 0xA1
        int gbEnd = 55289;
        int gbLength = gbEnd - gbStart;

        int random = (int) (gbStart + Math.random()*gbLength);
        System.out.println(random);
        return '2';
    }

    public static char getZHCN(int position) {
        byte rare = (byte) (position >> 8);
        byte bit = (byte) position;

        /**
         * -128 - 127
         * 有效的是 -2 到 -95
         * 无效范围是 -1 到 127 -128 到 -96
         */
        if(bit >= -1 || bit <= -96){
            return 0;
        }

        String s = null;
        try {
            s = new String(new byte[]{rare,bit}, "GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return 0;
        }
        return s.charAt(0);
    }
}
