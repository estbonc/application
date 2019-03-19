package com.estbon.application.demo;

import java.util.Date;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/19 9:55
 * @description
 */
public class Demo08 {

    public static void main(String[] args) {



        Date date = new Date(1524554232000l);
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);


//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        System.out.println(timestamp);



//        StringBuffer buffer = new StringBuffer();
//        buffer.append("123356677").append(",");
//
//        System.out.println(buffer);
//
//        buffer = buffer.delete(buffer.length() - 1, buffer.length());
//        System.out.println(buffer);
    }
}
