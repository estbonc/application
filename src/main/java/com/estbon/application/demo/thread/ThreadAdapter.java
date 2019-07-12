//package com.estbon.application.demo.thread;
//
//import org.apache.catalina.core.ApplicationContext;
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.core.task.support.ExecutorServiceAdapter;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.Future;
//
///**
// * @author liushuaishuai
// * @date 2019/6/13 16:35
// * <p>
// * remark:
// */
//public class ThreadAdapter {
//
//
//    public static void main(String[] args) {
//
//        ThreadPoolTaskExecutor threadPool = atx.getBean("threadPool", ThreadPoolTaskExecutor.class);
//        ExecutorServiceAdapter adapter = new ExecutorServiceAdapter(threadPool);
//        List<Callable<Integer>> tasks = new ArrayList<>();
//        Callable<Integer> task = null;
//        for (int i = 0; i < 10; i++){
//            task = new Callable<Integer>() {
//                @Override
//                public Integer call() throws Exception {
//                    int time = new Random().nextInt(1000);
//                    Thread.sleep(100);
//                    System.out.println(Thread.currentThread().getName() + " has slept " + time);
//                    return time;
//                }
//            };
//            //submit task and wait to execute
//            threadPool.submit(task);
//            //add all task to list
//            tasks.add(task);
//        }
//
//        //get the start time of all threads
//        long start = System.currentTimeMillis();
//        try {
//            List<Future<Integer>> result = adapter.invokeAll(tasks);
//            for (int i = 0; i < result.size(); i++){
//                System.out.println(result.get(i).get());
//            }
//        } catch (ExecutionException ex){
//            ex.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Total time is " + (System.currentTimeMillis() - start));
//    }
//}
