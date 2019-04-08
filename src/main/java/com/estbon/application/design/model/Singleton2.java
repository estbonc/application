package com.estbon.application.design.model;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/1 10:52
 * @description 懒汉模式实现单例模式（单线程和并发两种情况）
 */
public class Singleton2 {

    private volatile static Singleton2 instance;

//    private  static Singleton2 instance;
    private Singleton2 (){
    }

//    public static synchronized Singleton2 getInstance() {
//        if (instance == null) {
//            instance = new Singleton2();
//        }
//        return instance;
//    }

    public static Singleton2 getInstance() {
        if (instance== null) {
            synchronized (Singleton2.class) {
                if (instance== null) {
                    instance= new Singleton2();
                }
            }
        }
        return instance;
    }

}
