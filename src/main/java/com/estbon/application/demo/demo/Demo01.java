package com.estbon.application.demo.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liushuaishuai
 * @date 2019/9/17 13:57
 */
public class Demo01 {

    public static void main(String[] args) {

//        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
//
//        Map<String, String> map = new HashMap<>();
//        for (int i = 0; i < 500000; i++) {
//            concurrentHashMap.put(String.valueOf(i), String.valueOf(i));
//
//        }


        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("two");
        list.add("two");
        System.out.println("移除前");
        System.out.println(list);
//        Iterator<String> iter = list.iterator();
//        while (iter.hasNext()) {
//            String s = iter.next();
//            if (s.equals("two")) {
//                iter.remove();
//            }
//        }
        list.remove("two");
        System.out.println("移除后");
        System.out.println(list);

    }
}
