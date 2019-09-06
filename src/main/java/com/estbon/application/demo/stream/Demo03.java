package com.estbon.application.demo.stream;

import com.estbon.application.demo.bean.Apple;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liushuaishuai
 * @date 2019/9/6 9:43
 */
public class Demo03 {
    public static void main(String[] args) {
        List<Apple> list = Lists.newArrayList();

        list.add(new Apple(1, "yellow"));
        list.add(new Apple(2, "blue"));
        list.add(new Apple(3, "red"));

        System.out.println(list.stream().mapToInt(Apple::getWeight).summaryStatistics());

        String[] abc = {"hello world", "good morning"};
        List<String[]> collect = Stream.of(abc).map(a -> a.split("")).collect(Collectors.toList());
        collect.stream().forEach(aa -> {
            System.out.println(aa);
        });

//        List<String> collect1 = Stream.of(abc).flatMap(a -> Stream.of(a.split(""))).collect(Collectors.toList());
//        collect1.stream().forEach(aa -> {
//            System.out.println(aa);
//        });

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

    }


}
