package com.estbon.application.demo.thread;


/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/3/2 17:59
 * @description 线程相关
 */
public class Demo20 {
    public int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final Demo20 test = new Demo20();
        for (int i = 0; i < 10; i++) {
            new Thread() {
                public void run() {
                    for (int j = 0; j < 1000; j++)
                        test.increase();
                }

                ;
            }.start();
        }
        //保证前面的线程都执行完
        while (Thread.activeCount() > 1)
            Thread.yield();
        System.out.println(test.inc);

        System.out.println(Thread.currentThread().isInterrupted());
    }

}
