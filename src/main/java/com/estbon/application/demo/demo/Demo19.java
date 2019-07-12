package com.estbon.application.demo.demo;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/1/30 10:55
 * @description 时间单位测试
 */
public class Demo19 {

    public static void main(String[] args) {

        System.out.println(TimeUnit.DAYS.getDeclaringClass());

        System.out.println(UUID.randomUUID());

        System.out.println(TimeUnit.DAYS.toMillis(1));
        System.out.println(TimeUnit.HOURS.toMillis(1));
        System.out.println(TimeUnit.MINUTES.toMillis(1));
    }


}
