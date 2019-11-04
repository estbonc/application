package com.estbon.application.beautiful.alibaba;

/**
 * @author liushuaishuai
 * @date 2019/10/30 16:09
 */
public class ThreadTest {


    public static void main(String[] args) {

        String[] arr = new String[15];


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                arr[3 * i] = "A";
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                arr[(3 * i) + 1] = "l";
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                arr[(3 * i) + 2] = "i";
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }


}
