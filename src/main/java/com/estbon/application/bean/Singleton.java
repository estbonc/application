package com.estbon.application.bean;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/3/2 18:00
 * @description
 */
public class Singleton {

    private Singleton() {
    }

    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();

        static {
            System.out.println("LazyHolder.<clinit>");
        }
    }

    public static Object getInstance(boolean flag) {
        if (flag)
            return new LazyHolder[2];
        return LazyHolder.INSTANCE;
    }

    public static void main(String[] args) {
        getInstance(true);
        System.out.println("----");
        getInstance(false);
    }

//    $ javac Singleton.java
//    $ java -verbose:class Singleton

}
