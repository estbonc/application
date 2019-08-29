package com.estbon.application.demo.reflect;

import com.estbon.application.demo.bean.Student;

/**
 * @author liushuaishuai
 * @date 2019/8/29 17:00
 */
public class ReflectDemo1 {


    public static void main(String[] args) {
        //获取类对象的方式有三种

        //1
        Class<Student> s1 = Student.class;
        System.out.println("s1--" + s1);

        //2
        Student student = new Student();
        Class<? extends Student> s2 = student.getClass();
        System.out.println("s2--" + s2);

        //3
        try {
            Class<?> s3 = Class.forName("com.estbon.application.demo.bean.Student");
            System.out.println("s3--" + s3);

            System.out.println(s1 == s2);
            System.out.println(s1 == s3);
            System.out.println(s3 == s2);

            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));
            System.out.println(s3.equals(s2));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
