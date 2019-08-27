package com.estbon.application.demo.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author liushuaishuai
 * @date 2019/6/13 16:35
 * <p>
 * remark:
 */
public class ThreadAdapter {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("我是delay"), 10, 5, TimeUnit.SECONDS);
    }
}
