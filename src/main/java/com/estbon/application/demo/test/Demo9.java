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

//        List<Apple> b = Lists.newArrayList();
//        b.add(new Apple(1, "yellow"));
//        b.add(new Apple(2, "yellow"));
//        a.removeAll(b);
//        a.forEach(System.out::println);
//
//
//        double ceil = Math.ulp(3.01d);
//        System.out.println(ceil);

        Apple[] users = new Apple[]{
                new Apple(1, "admin"),
                new Apple(2, "maco"),
                new Apple(3, "kitty")
        };

        Object[] objects = users;
        System.out.println(objects.getClass());     // class [Ltest.User;
        objects = new Object[users.length];
        System.arraycopy(users, 0, objects, 0, Math.min(users.length, objects.length));
        System.out.println(objects.getClass());     // class [Ljava.lang.Object;
        System.out.println(objects[0] == users[0]); // true



    }
}
