package com.estbon.application.demo.stream;


import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/8/13 11:08
 * @description
 */
public class Demo02 {


    public static void main(String[] args) {
        List<String> test = Lists.newArrayList();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("1");
        test.add("3");
        test.add("4");

        test.add("5");
        test.add("1");

        Map<String, List<String>> collect = test.stream().collect(Collectors.toMap(key -> key, Lists::newArrayList,
                (List<String> newValueList, List<String> oldValueList) -> {
                    oldValueList.addAll(newValueList);
                    return oldValueList;
                }));

        collect.entrySet().forEach(System.out::println);

        System.out.println("===========================");
        Map<String, List<String>> collect1 = test.stream().collect(Collectors.groupingBy(key -> key));

        collect1.entrySet().forEach(System.out::println);
        System.out.println("===========================");
        test = test.stream().filter(id -> Integer.parseInt(id) > 2).collect(Collectors.toList());
        test = test.stream().filter(id -> Integer.parseInt(id) > 4).collect(Collectors.toList());
        test.forEach(System.out::println);

    }


}
