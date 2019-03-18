package com.estbon.application.demo;

/**
 * @author liushuaishuai
 * @date 2018/3/15 15:43
 */
public class Demo03 {
    private static boolean stop = false;

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                long l = 0;
                while (!stop) {
                    l++;
                }
                System.out.println("l == " + l);
            }
        };
        t1.start();

        try {
            Thread.sleep(2000);
            System.out.println("stop == true");
            stop = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
