package com.estbon.application.beautiful.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liushuaishuai
 * @date 2019/9/26 9:26
 * 13. 罗马数字转整数
 */
public class LeetCode13 {


    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("MDCXCV"));
    }

    //    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        Map<String, Integer> vmap = new HashMap<>();
        vmap.put("", 0);
        vmap.put("IV", 4);
        vmap.put("IX", 9);
        vmap.put("XL", 40);
        vmap.put("XC", 90);
        vmap.put("CD", 400);
        vmap.put("CM", 900);
        if (vmap.get(s) != null) {
            return vmap.get(s);
        }
        int length = s.length();

        int num = 0;
        for (int i = 0; i < length; i++) {
            int t = i;
            if (t + 2 <= length) {
                t += 2;
            } else {
                t += 1;
            }
            String ss = s.substring(i, t);
            if (vmap.get(ss) != null) {
                num += vmap.get(ss);
                i++;
            } else {
                num += map.get(ss.charAt(0));

            }
        }
        return num;
    }

}
