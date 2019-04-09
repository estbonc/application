package com.estbon.application.design.model.singleton;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/1 10:47
 * @description 饿汉模式实现单例模式
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1(){

    }

    public static  Singleton1 getInstance(){
        return instance;
    }

}
