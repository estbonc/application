package com.estbon.application.demo.demo;

/**
 * @author liushuaishuai
 * @date 2018/3/19 12:37
 *
 *
 * String类测试
 */
public class Demo04 {

    public static void main(String[] args) {
        String str1  = "com/estbon/gradle/example";
        String str2 = str1 ;
        String str3 = new String("com/estbon/gradle/example");
        String str4 = new String("com/estbon/gradle/example");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);
        System.out.println(str1.equals(str3));


        System.out.println("5" + 2);

        System.out.println(2 + "5");
    }






}
