package com.estbon.application.demo.test;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/16 13:49
 * @description 题目测试
 */
public class Demo03 {

    private String str = new String("good");
    private char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {

        Demo03 demo = new Demo03();
        demo.change(demo.str, demo.ch);
        System.out.print(demo.str + " and ");
        System.out.print(demo.ch);

    }

    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }


}
