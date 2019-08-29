package com.estbon.application.demo.reflect;

import com.estbon.application.demo.bean.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

/**
 * @author liushuaishuai
 * @date 2019/8/29 17:00
 */
public class ReflectDemo2 {

    public static void main(String[] args) {

        Class<Student> studentClass = Student.class;

        Field[] fields = studentClass.getFields();
        Stream.of(fields).forEach(t -> {
            System.out.println(t);
        });

        System.out.println("--------------------->");
        Stream.of(fields).forEach(t -> {
            String s = Modifier.toString(t.getModifiers());
            System.out.println(s + " " + t.getGenericType() + " " + t.getName());
        });
        System.out.println("--------------------->");

        Field[] declaredFields = studentClass.getDeclaredFields();

        Stream.of(declaredFields).forEach(t -> {
            System.out.println(t);
        });
        System.out.println("--------------------->");

        Stream.of(declaredFields).forEach(t -> {
            String s = Modifier.toString(t.getModifiers());
            System.out.println(s + " " + t.getGenericType() + " " + t.getName());
        });
        System.out.println("--------------------->");
        Method[] methods = studentClass.getMethods();
        Stream.of(methods).forEach(t -> {
            System.out.println(t);
        });
        System.out.println("--------------------->");
        Method[] declaredMethods = studentClass.getDeclaredMethods();
        Stream.of(declaredMethods).forEach(t -> {
            System.out.println(t);
        });



    }

}
