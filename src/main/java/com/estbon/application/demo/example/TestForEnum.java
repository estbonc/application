package com.estbon.application.demo.example;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/8 10:44
 * @description
 */
public class TestForEnum {

//    public static void main(String[] args) {
//
////
////        int randLen = 10 - 3;
////        int a = Double.valueOf(Math.pow(10, randLen)).intValue();
////        System.out.println(a);
//
////        TestForEnum testForEnum = new TestForEnum();
////        System.out.println(testForEnum.getClass().getTypeName());
//
//
//        Apple apple = new Apple();
//        apple.setColor("yellow");
//        System.out.println(apple.getClass().getTypeName());
//        getClass1(apple, apple.getClass());
//
//
//    }


    private static void getClass1(Object object, Class _class) {
        try {
            Field[] fields = _class.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                String fieldName = fields[i].getName();
                String fieldType = fields[i].getGenericType().toString();

                String concat = "get".concat(fieldName.substring(0, 1).toUpperCase()).concat(fieldName.substring(1));
                Method method = object.getClass().getMethod(concat);

                String str = (String)method.invoke(object);

                System.out.println(str);

                System.out.println(method);

                System.out.println(concat);
                System.out.println(fieldName);
                System.out.println(fieldType);

            }



        }catch (Exception e){

        }


    }


}
