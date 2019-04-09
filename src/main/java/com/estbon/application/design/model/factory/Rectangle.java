package com.estbon.application.design.model.factory;


/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/9 15:44
 * @description
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
