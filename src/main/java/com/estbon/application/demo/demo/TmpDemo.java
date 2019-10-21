package com.estbon.application.demo.demo;

/**
 * @author liushuaishuai
 * @date 2019/10/16 15:30
 */
public class TmpDemo {


    public static void main(String[] args) {

        Long abc = 0L;

        System.out.println(abc.equals(56L));
        System.out.println(compare(abc));

    }


    public static boolean compare(Long a) {
        return a.equals(0L);
    }
}
