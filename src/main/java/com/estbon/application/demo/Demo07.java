package com.estbon.application.demo;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/16 13:49
 * @description
 */
public class Demo07 {

    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {

        Demo07 demo = new Demo07();
        demo.change(demo.str, demo.ch);
        System.out.print(demo.str + " and ");
        System.out.print(demo.ch);

    }

    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }


}
