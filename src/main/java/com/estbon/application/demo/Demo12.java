package com.estbon.application.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/6/6 17:45
 * @description
 */
public class Demo12 {


    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        for (int i = 0; i < 24; i++) {
            list.add(i);
        }
        Demo12 demo12 = new Demo12();
        demo12.getList(list, 22);
    }

    private List<List<Integer>> getList(List<Integer> list, int a) {
        ArrayList resultList = new ArrayList<>();
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
