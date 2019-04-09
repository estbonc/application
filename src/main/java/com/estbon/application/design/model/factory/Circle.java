package com.estbon.application.design.model.factory;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/9 15:46
 * @description
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
