package com.estbon.application.demo.stream;


import com.estbon.application.demo.bean.StreamBean;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/25 12:40
 * @description Stream 流测试
 */
public class Demo01 {

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
        List<PeopleDemo> peopleDemos;

        // 原始数据
        System.out.println("原始数据 组装list<demo>*******************");
        peopleDemos = list.stream().map(streamBean -> new PeopleDemo(streamBean.getAge(), streamBean.getSex())).collect(Collectors.toList());
        peopleDemos.forEach(peopleDemo -> System.out.println("年龄 " + peopleDemo.getAge() + "  性别 " + peopleDemo.getSex() + ","));

        // 只取sex为0
        System.out.println("只取sex为0****************");
        List<PeopleDemo> demorm = peopleDemos.stream().filter(peopleDemo -> peopleDemo.getSex() == 0).distinct().collect(Collectors.toList());
        demorm.forEach(peopleDemo -> System.out.println("年龄 " + peopleDemo.getAge() + "  性别 " + peopleDemo.getSex() + ","));

        // 筛选年龄大于12岁
        System.out.println("筛选年龄大于12岁的*************");
        List<PeopleDemo> peopleDemoFilter = peopleDemos.stream().filter(peopleDemo -> Integer.valueOf(peopleDemo.getAge()) > 12).collect(Collectors.toList());
        peopleDemoFilter.forEach(peopleDemo -> System.out.println("年龄 " + peopleDemo.getAge() + "  性别 " + peopleDemo.getSex() + ","));

        // 排序
        System.out.println("排序******************");
        List<PeopleDemo> peopleDemoSort = peopleDemos.stream().sorted(Comparator.comparing(PeopleDemo::getAge)).collect(Collectors.toList());
        peopleDemoSort.forEach(peopleDemo -> System.out.println("年龄 " + peopleDemo.getAge() + "  性别 " + peopleDemo.getSex() + ","));

        // 倒序
        System.out.println("倒序****************");
        ArrayList<PeopleDemo> peopleDemoArray = (ArrayList<PeopleDemo>) peopleDemos;

        Comparator<PeopleDemo> comparator = Comparator.comparing(PeopleDemo::getAge);
        peopleDemos.sort(comparator.reversed());
        //or
        peopleDemos.sort(Comparator.comparing(PeopleDemo::getAge).reversed());

        peopleDemos.forEach(peopleDemo -> System.out.println("年龄 " + peopleDemo.getAge() + "  性别 " + peopleDemo.getSex() + ","));

        // 多条件正序
        System.out.println("多条件排序正序****************");
        peopleDemoArray.sort(Comparator.comparing(PeopleDemo::getSex).thenComparing(PeopleDemo::getAge));
        peopleDemoArray.forEach(peopleDemo -> System.out.println("年龄 " + peopleDemo.getAge() + "  性别 " + peopleDemo.getSex() + ","));

        // 多条件倒序
        System.out.println("多条件排序倒序 sex  倒序****************");
        peopleDemoArray.sort(Comparator.comparing(PeopleDemo::getSex).reversed().thenComparing(PeopleDemo::getAge));
        peopleDemoArray.forEach(peopleDemo -> System.out.println("年龄 " + peopleDemo.getAge() + "  性别 " + peopleDemo.getSex() + ","));

        // 按照年龄分组
        System.out.println("根据age分组结果为Map****************");
        Map<String, List<PeopleDemo>> demoOder = peopleDemos.stream().collect(Collectors.groupingBy(PeopleDemo::getAge));
        System.out.println(demoOder);
    }
}

