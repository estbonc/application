package com.estbon.application.demo.reflect;

import com.estbon.application.demo.bean.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liushuaishuai
 * @date 2019/8/29 17:28
 */
public class ReflectDemo3 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        student.setName("lss");
        reflectTest(student);

    }

    private static void reflectTest(Object obj) {
        Class<?> s1 = obj.getClass();

        try {
            Method introduce = s1.getMethod("introduce");
            introduce.invoke(obj);

            Method say = s1.getMethod("say", String.class);
            say.invoke(obj, "嘻嘻哈哈");

            Method add = s1.getMethod("add", int.class, int.class);
            Object invoke = add.invoke(obj, 3, 8);
            System.out.println(invoke);

            Method play = s1.getDeclaredMethod("play");
            play.setAccessible(true);
            play.invoke(obj);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
