package com.estbon.application.demo.demo;

import java.util.ArrayList;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/19 9:55
 * @description
 */
public class Demo08 {

    public static void main(String[] args) {

        ArrayList<Long> list1 = new ArrayList<>(10);
        System.out.println(list1.add(1L));
        list1.add(2L);
        list1.add(3L);
        list1.add(4L);
        System.out.println(list1.set(9, 55L));
        System.out.println(list1.get(1));
        System.out.println(list1.size());
        System.out.println(list1.get(9));
        Object[] objects = list1.toArray();

        Class<? extends Object[]> aClass = objects.getClass();
        System.out.println(aClass);
        System.out.println(Object[].class);
        System.out.println(aClass == Object[].class);

        ArrayList<Long> list2 = new ArrayList<>(list1);

    }
}
