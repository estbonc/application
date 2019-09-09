package com.estbon.application.demo.reflect;

/**
 * @author liushuaishuai
 * @date 2019/9/9 17:47
 */
public class Person implements Animal {

    @Override
    public void eat(String name) {
        System.out.println(name + ":吃了海鲜");
    }
}
