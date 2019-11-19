package com.estbon.application.demo.test;

import com.estbon.application.demo.bean.Apple;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author liushuaishuai
 * @date 2019/11/19 14:59
 */
public class Demo9 {

    public static void main(String[] args) {

        List<Apple> a = Lists.newArrayList();
        a.add(new Apple(1, "yellow"));
        a.add(new Apple(2, "yellow"));
        a.add(new Apple(3, "yellow"));

        List<Apple> b = Lists.newArrayList();
        b.add(new Apple(1, "yellow"));
        b.add(new Apple(2, "yellow"));
        a.removeAll(b);
        a.forEach(aaa -> {
            System.out.println(aaa);
        });
    }
}
