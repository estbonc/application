package com.estbon.application.demo.demo;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liushuaishuai
 * @date 2019/10/16 15:30
 */
public class TmpDemo {

    private static final String FORMAT_PATTERN_DATE_TIME = "yyyy-MM-dd HH:mm:ss";

    private static List<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        Stream<Long> longStream = Stream.of(1L, 2L, 0L, 0L, null, null);
        longStream.sorted(Long::compareTo).collect(Collectors.toList()).forEach(System.out::println);


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


    public static String secondToStringDateTime(long time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_PATTERN_DATE_TIME);
        Date date = new Date(time * 1000);
        return simpleDateFormat.format(date);
    }
}
