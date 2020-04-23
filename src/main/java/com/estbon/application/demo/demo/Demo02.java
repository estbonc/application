package com.estbon.application.demo.demo;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 数组测试
 */
public class Demo02 {

    public static void main(String[] args) {
        Month month = Month.of(12);
        System.out.println(month);


        String abc = "1,2,3,4";
        List<Long> collect = Stream.of(abc.split(",")).map(Long::parseLong).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

    /**
     * 查询给定数值X在数组中的位置
     *
     * @param x   给定的数值
     * @param arr 给定的数组
     * @return
     */
    public int find(int x, int[] arr) {
        //数组是有序的，遍历数组中元素的值，
        // 与X做比较如果相等则该元素下标+1即为在有序数组中第一次出现的位置
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i + 1;
            }
        }
        return 0;
    }
}
