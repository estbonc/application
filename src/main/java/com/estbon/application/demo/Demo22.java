package com.estbon.application.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author liushuaishuai
 * @date 2019/5/27 9:18
 * <p>
 * remark:
 */
public class Demo22 implements Callable {

    private String a;

    private static int ddd;

    public Demo22(String a) {
        this.a = a;
    }

    @Override
    public Object call() throws Exception {
        return null;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int taskSize = 5;
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);


        // 创建多个有返回值的任务
        List<Future> list = new ArrayList<Future>();
        for (int i = 0; i < taskSize; i++) {
            Callable c = new Demo22(i + " ");

            Future f = pool.submit(c);
            list.add(f);
        }
        // 执行任务并获取Future对象

        // 关闭线程池
        pool.shutdown();
        // 获取所有并发任务的运行结果
        for (Future f : list) {
            // 从Future对象上获取任务的返回值，并输出到控制台
            System.out.println("res：" + f.get().toString());
        }


        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟三秒");
            }
        }, 3, TimeUnit.SECONDS);
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1秒后每三秒执行一次");
            }
        }, 1, 3, TimeUnit.SECONDS);





    }
}
