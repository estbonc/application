package com.estbon.application.demo.example;


/**
 * @author liushuaishuai
 * @date 2018/3/19 12:45
 */
public class ExampleA {
    public ExampleA() {
        System.out.println("实例化ExampleA");
    }

    {
        System.out.println("这是A");
    }

    static {
        System.out.println("ExampleA");
    }



    public void test1(){
        System.out.println("我是A的test1方法");
        test2();
    }

    public void test2(){
        System.out.println("我是A的test2方法");
    }

}
