package com.estbon.application.demo.example;


/**
 * @author liushuaishuai
 * @date 2019/11/18 16:14
 */
public class TestB extends TestA {


    public LearningContext build() {
        TestC testC = (TestC) ApplicationContextProvider.getBean("testC");
        testC.getSSS();
        System.out.println("testB build method");
        return context;
    }


    public static void main(String[] args) {

        LearningContext build = new TestB().initContext(123L, 345L)
                .enableCalculateAllResource()
                .enablePersistence().build();

        System.out.println(build);
    }
}
