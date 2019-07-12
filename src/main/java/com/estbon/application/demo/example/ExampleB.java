package com.estbon.application.demo.example;

/**
 * @author liushuaishuai
 * @date 2018/3/19 12:45
 */
public class ExampleB extends ExampleA {
    public ExampleB() {
        System.out.println("实例化ExampleB");
    }

    {
        System.out.println("这是B");
    }

    static {
        System.out.println("ExampleB");
    }


    public void test1(){
        System.out.println("我是B的test1方法");
        super.test1();
    }

    public void test2(){
        System.out.println("我是B的test2方法");
    }


    public static void main(String[] args) {
        ExampleB exampleB = new ExampleB();
        exampleB.test1();
        ExampleA exampleA = new ExampleA();
        exampleA.test1();
    }


}
