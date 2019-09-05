package com.estbon.application.demo.test;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/3/28 18:40
 * @description 值测试
 */
public class Demo06 {

    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b);
        System.out.println("Byte max = " + Byte.MAX_VALUE);
        System.out.println("Byte min = " + Byte.MIN_VALUE);
        System.out.println("Short min = " + Short.MIN_VALUE);
        System.out.println("Short max = " + Short.MIN_VALUE);
        System.out.println("Integer max = " + Integer.MAX_VALUE);
        System.out.println("Integer min = " + Integer.MIN_VALUE);
        int in = 1;
        for (int i = 0; i < 16; i++) {
            in = in * 2;
            System.out.print("2 的" + (i + 1) + "次方:" + in);

            System.out.println();
        }

    }


}
