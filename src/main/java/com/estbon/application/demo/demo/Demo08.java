package com.estbon.application.demo.demo;

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
    }
}
