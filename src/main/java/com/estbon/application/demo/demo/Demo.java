package com.estbon.application.demo.demo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liushuaishuai
 * @date 2020/11/23 10:17
 */
public class Demo {
    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int CAPACITY   = (1 << COUNT_BITS) - 1;
    public static void main(String[] args) {

        int RUNNING = -1 << COUNT_BITS;
        System.out.println(RUNNING);
        System.out.println(CAPACITY);
        System.out.println("====");
        System.out.println(0 << COUNT_BITS);
        System.out.println(1 << COUNT_BITS);
        System.out.println(2 << COUNT_BITS);
        System.out.println(3 << COUNT_BITS);

        AtomicInteger ctl = new AtomicInteger(RUNNING | 0);
        System.out.println( ctl.get() & CAPACITY);
        System.out.println("ctl " + ctl.get());
    }
}
