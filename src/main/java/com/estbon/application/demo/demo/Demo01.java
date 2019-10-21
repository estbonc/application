package com.estbon.application.demo.demo;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author liushuaishuai
 * @date 2019/9/17 13:57
 */
public class Demo01 {

    public static void main(String[] args) {


        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(1, 8);
        map.put(2, 3);
        Map<Integer, String> collect = map.entrySet().stream().collect(Collectors.toMap(mapEntry -> mapEntry.getKey(), mapEntry -> String.valueOf(mapEntry.getValue())));

        collect.forEach((a, b) -> {
            System.out.println("key " + a.getClass() + a);
            System.out.println("value " + b.getClass() + b);

        });


    }


}
