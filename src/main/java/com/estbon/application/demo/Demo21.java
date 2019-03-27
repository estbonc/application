package com.estbon.application.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/3/20 11:06
 * @description  位运算
 */
public class Demo21 {


    public static void main(String[] args) {


        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );


//        Map<String ,String> map = new HashMap<>();
//        map.put("1","2");
//        System.out.println(map.remove("1","2"));
//        ConcurrentHashMap
    }
}
