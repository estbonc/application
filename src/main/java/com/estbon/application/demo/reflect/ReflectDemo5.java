package com.estbon.application.demo.reflect;

import java.lang.reflect.Proxy;

/**
 * @author liushuaishuai
 * @date 2019/9/9 17:51
 */
public class ReflectDemo5 {

    public static void main(String[] args) {
        Animal animal = new AnimalStaticProxy(new Person());
        animal.eat("小张");

        Person person = new Person();
        DynamicProxyAnimal handler = new DynamicProxyAnimal(person);

        Animal animal1 = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(),new Class[] {Animal.class }, handler);
        animal1.eat("小动");  //执
    }
}
