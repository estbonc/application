package com.estbon.application.demo.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liushuaishuai
 * @date 2019/11/28 10:34
 */
public class FhSteam {


    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("1,2,3", "4,5,7");

        List<Long> collect = list.stream().flatMap(a -> Stream.of(a.split(",")).map(Long::parseLong)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
