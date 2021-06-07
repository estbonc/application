package com.estbon.application.demo.thread;

/**
 * @author liushuaishuai
 * @date 2021/6/7 23:12
 */
public class TSynchronized implements Runnable {

    static int i = 0;

    public synchronized void increase() {
        i++;
        System.out.println(Thread.currentThread().getName());
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        TSynchronized tSynchronized = new TSynchronized();
        Thread aThread = new Thread(tSynchronized);
        Thread bThread = new Thread(tSynchronized);
        aThread.start();
        bThread.start();
        aThread.join();
        bThread.join();
        System.out.println("i = " + i);
    }
}


