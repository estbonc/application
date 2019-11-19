package com.estbon.application.demo.stream;

import com.estbon.application.demo.bean.StreamBean;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author liushuaishuai
 * @date 2019/11/18 10:47
 */
public class Demo04 {

    public static void main(String[] args) {
        List<StreamBean> list = new ArrayList<>();
        StreamBean streamBean1 = new StreamBean();
        streamBean1.setAge("12");
        streamBean1.setSex(0);
        StreamBean streamBean2 = new StreamBean();
        streamBean2.setAge("13");
        streamBean2.setSex(2);
        StreamBean streamBean3 = new StreamBean();
        streamBean3.setAge("11");
        streamBean3.setSex(1);
        StreamBean streamBean4 = new StreamBean();
        streamBean4.setAge("18");
        streamBean4.setSex(1);
        StreamBean streamBean5 = new StreamBean();
        streamBean5.setAge("18");
        streamBean5.setSex(0);
        StreamBean streamBean6 = new StreamBean();
        streamBean6.setAge("18");
        streamBean6.setSex(2);
        StreamBean streamBean7 = new StreamBean();
        streamBean7.setAge("18");
        streamBean7.setSex(2);
        list.add(streamBean1);
        list.add(streamBean2);
        list.add(streamBean3);
        list.add(streamBean4);
        list.add(streamBean5);
        list.add(streamBean6);
        list.add(streamBean7);
        List<Demo> demos;

        // 原始数据
        System.out.println("原始数据 组装list<demo>*******************");
        demos = list.stream().map(streamBean -> new Demo(streamBean.getAge(), streamBean.getSex())).collect(Collectors.toList());
        demos.forEach(demo -> System.out.println("年龄 " + demo.getAge() + "  性别 " + demo.getSex() + ","));

        // 只取sex为0
        System.out.println("只取sex为0****************");
        List<Demo> demorm = demos.stream().filter(demo -> demo.getSex() == 0).distinct().collect(Collectors.toList());
        demorm.forEach(demo -> System.out.println("年龄 " + demo.getAge() + "  性别 " + demo.getSex() + ","));


        // 只取sex为0
        System.out.println("只取sex为0****************");
        demos = demos.stream().filter(demo -> demo.getSex() == 0).distinct().collect(Collectors.toList());
        demos.forEach(demo -> System.out.println("年龄 " + demo.getAge() + "  性别 " + demo.getSex() + ","));


    }
}
