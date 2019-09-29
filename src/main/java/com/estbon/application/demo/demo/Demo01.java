package com.estbon.application.demo.demo;


/**
 * @author liushuaishuai
 * @date 2019/9/17 13:57
 */
public class Demo01 {

    public static void main(String[] args) {
        Long number = 0L;

        update(number);

        System.out.println(number);


    }

    public static void update(Long number) {
        if (number == 0) {
            number += 5;
        }
    }
}
