package com.estbon.application.demo.reflect;

/**
 * @author liushuaishuai
 * @date 2019/9/9 17:48
 */
public class AnimalStaticProxy implements Animal {

    private Person person;

    public AnimalStaticProxy(Person person) {
        this.person = person;
    }


    @Override
    public void eat(String name) {
        System.out.println("吃之前~~~");
        person.eat(name);
        System.out.println("吃之后~~~");
    }
}
