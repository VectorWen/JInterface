package com.vector.jinterface.edsc;

/**
 * author: vector.huang
 * date：2016/5/24 11:46
 */
public class Test4 {

    public static void main(String[] args) {
        String get = GetterSetter.create("nice",boolean.class);
        System.out.println(get);
        get = GetterSetter.create("nice",boolean.class,"@OneToOne\n" +
                "@JoinColumn(name = \"categoryId\")");
        System.out.println(get);
    }
}
