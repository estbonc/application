package com.estbon.application.demo.reflect;

import com.estbon.application.design.model.singleton.Singleton1;

import java.lang.reflect.Constructor;

/**
 * @author liushuaishuai
 * @date 2019/8/29 18:23
 */
public class ReflectDemo4 {

    public static void main(String[] args) {
        // 使用单例模式
        Singleton1 s = Singleton1.getInstance();
        Singleton1.getInstance();
        Singleton1.getInstance();

        try {
            // 通过反射的方式构造新对象
            Class<?> c = s.getClass();
            // 不行 因为私有的无法这样调用
//			c.newInstance();

            // 获得 c 中所有构造器 - 不能获取私有的
            Constructor<?>[] constructors = c.getConstructors();
            System.out.println(constructors.length);

            Constructor<?>[] constructors2 = c.getDeclaredConstructors();
            System.out.println(constructors2.length);

            // 获取那个无参的私有构造器
            Constructor<?> constructor = c.getDeclaredConstructor();
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
