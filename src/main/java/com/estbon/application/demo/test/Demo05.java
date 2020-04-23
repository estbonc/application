package com.estbon.application.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/6/6 17:45
 * @description list切分，测试题
 */
public class Demo05 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 24; i++) {
            list.add(i);
        }
        Demo05 demo05 = new Demo05();
        demo05.getList(list, 22);
    }

    private List<List<Integer>> getList(List<Integer> list, int a) {
        List<List<Integer>> resultList = new ArrayList<>();
        int size = list.size();
        int b = size % a;
        //数组的个数
        int c = size / a;
        for (int i = 0; b == 0 ? (i < c) : (i <= c); i++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int j = i * a; j < (i + 1) * a; j++) {
                if (j >= size) {
                    break;
                }
                list1.add(j);
            }
            resultList.add(list1);
        }
        System.out.println(resultList.toString());

        return resultList;
    }

}
