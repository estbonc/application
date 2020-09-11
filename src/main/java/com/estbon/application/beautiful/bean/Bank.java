package com.estbon.application.beautiful.bean;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/9 10:56
 * @description  ReentrantLock
 */
public class Bank {
    private double[] accounts;
    private Lock bankLock;
    private Condition condition;

    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        bankLock = new ReentrantLock();
        //得到条件对象
        condition = bankLock.newCondition();
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = initialBalance;
        }
    }

    public void transfer(int from, int to, int amount) throws InterruptedException {
        bankLock.lock();
        try {
            while (accounts[from] < amount) {
                //阻塞当前线程，并放弃锁
                condition.await();
            }
        } finally {
            bankLock.unlock();
        }
    }

    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup ("subgroup 1");
        Thread t1 = new Thread (tg, "thread 1");
        Thread t2 = new Thread (tg, "thread 2");
        Thread t3 = new Thread (tg, "thread 3");
        tg = new ThreadGroup ("subgroup 2");
        Thread t4 = new Thread (tg, "my thread");
        tg = Thread.currentThread ().getThreadGroup ();
        int agc = tg.activeGroupCount ();
        System.out.println ("Active thread groups in " + tg.getName () + " thread group: " + agc);
        tg.list ();
    }




}
