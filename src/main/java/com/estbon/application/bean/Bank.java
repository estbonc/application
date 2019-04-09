package com.estbon.application.bean;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/9 10:56
 * @description
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
}
