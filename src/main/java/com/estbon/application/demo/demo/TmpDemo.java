package com.estbon.application.demo.demo;


import com.google.common.collect.Maps;

import java.util.HashMap;

/**
 * @author liushuaishuai
 * @date 2019/10/16 15:30
 */
public class TmpDemo {


    public static void main(String[] args) {
       Long aaa= 3L;

        HashMap<Long, Object> map = Maps.newHashMap();
        System.out.println(-aaa);

        System.out.println("Math.negateExact :"+Math.negateExact(aaa));
        map.put(-aaa,new Object());
        System.out.println(map.get(-aaa));
    }

}
