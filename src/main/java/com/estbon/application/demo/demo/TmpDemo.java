package com.estbon.application.demo.demo;


/**
 * @author liushuaishuai
 * @date 2019/10/16 15:30
 */
public class TmpDemo {


    public static void main(String[] args) {
        String format = String.format("%d%04d", "1014", 1234);

        System.out.println(format);
        System.out.println(Long.parseLong(format));

    }


}
