package com.estbon.application.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/7/10 20:04
 * @description  list 复制
 */
public class Demo14 {


    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        Demo14 demo14 = new Demo14();
        demo14.getList(list);
    }



    public void getList(List<Integer> list){
        List<Integer> result = new ArrayList<>(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);

        Collections.copy(list1, result);
        for(Integer i :result){
            System.out.println(i);
        }


    }
}
