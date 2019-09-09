package com.estbon.application.demo.reflect;

import org.springframework.cglib.proxy.Enhancer;

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
        Animal animal1 = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(), new Class[]{Animal.class}, handler);
        animal1.eat("小动");  //执

        Enhancer enhancer = new Enhancer();//字节码增强器
        enhancer.setSuperclass(Bird.class);//设置被代理类为父类
        enhancer.setCallback(new CglibProxyBird());//设置回调
        Bird user = (Bird) enhancer.create();//创建代理实例
        user.eat("小鸟");


    }
}
