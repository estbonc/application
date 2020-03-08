package com.estbon.application.demo.demo;


import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author liushuaishuai
 * @date 2019/10/16 15:30
 */
public class TmpDemo {
    List<Integer> list = Lists.newArrayList(1, 2, 3, 4);


    public static void main(String[] args) {

        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);

        Integer[] integers = list.toArray(new Integer[0]);

        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }

        Long[] a = {1L, 2L, 3L};
        System.out.println(Arrays.toString(a));

        System.out.println(StringUtils.join(a, ","));
    }


}
