package com.vector.jinterface.util;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * author: vector.huang
 * date：2016/3/30 11:07
 */
public class UnicodeTest {

    @Test
    public void testRandom() throws UnsupportedEncodingException {
        //最小值+Math.random()*(最大值-最小值+1)
        int gbStart = 45217;//(0xB0 << 8) + 0xA1
        int gbEnd = 55289;
        int gbLength = 55289 - 45217;
        for(int i=0;i<100;i++){
            int random = (int) (gbStart + Math.random()*(gbLength+1));
            char c = UnicodeUtils.getZHCN(random);
            if(c != 0)
            System.out.println(random +" = " + c);
        }
    }

    @Test
    public void testZHCN() throws UnsupportedEncodingException {
        int start = 24000;
        int length = 0;
        for (int i = start; i < start + length; i++) {
            char j = (char) i;
            System.out.print(j);
            if (i % 100 == 0) {
                System.out.println();
            }
        }


        /**
         * 2字节组成，表示成功16 进制就有0x****
         *
         * 第一颗* 范围：B-D
         * 第二课* 范围：0-F
         * 第三颗* 范围：A-F
         * 第四颗* 范围：0-F
         *
         * 不能出现0x**A0、0x**FF 情况
         *
         */


        int gbStart = 45217;//(0xB0 << 8) + 0xA1
        int gbLength = 3755;
        int gbEnd = 55289;
        for (int i = gbStart; i <gbStart + gbLength; i++) {
            byte rare = (byte) (i >> 8);
            byte bit = (byte) i;

            /**
             * -128 - 127
             * 有效的是 -2 到 -95
             * 无效范围是 -1 到 127 -128 到 -96
             */
            if(bit >= -1 || bit <= -96){
                continue;
            }
            String s = new String(new byte[]{rare,bit}, "GB2312");
//            System.out.printf("(%d)",bit);
            System.out.print(s);
            if (i % 30 == 0) {
//                System.out.println();
            }
            if(s.equals("座")){
                System.out.println();
                System.out.println(i);
                break;
            }
        }

    }

}
