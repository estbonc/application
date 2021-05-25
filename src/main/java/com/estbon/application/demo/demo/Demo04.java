package com.estbon.application.demo.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liushuaishuai
 * @date 2018/3/19 12:37
 * <p>
 * <p>
 * String类测试
 */
public class Demo04 {
    private static List<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> iter = list.iterator();

        // 存放10个线程的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        // 执行10个任务(我当前正在迭代集合（这里模拟并发中读取某一list的场景）)
        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                while (iter.hasNext()) {
                    System.err.println(iter.next());
                }
            });
        }

        // 执行10个任务
        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                list.add("121");// 添加数据
            });
        }

        System.err.println(Arrays.toString(list.toArray()));

    }

    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//            SomeBean someBean= (SomeBean) context.getBean("someBean");
//            someBean.doSomething();
    }


}
