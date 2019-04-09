package com.estbon.application.leetcode;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/9 19:40
 * @description https://leetcode.com/problems/reverse-integer/
 */
public class LeetCode7 {

    public int reverse(int x) {
//        if (x > 2 >> 32 || x < -2 << 32 - 1) {
//            return 0;
//        }
        String y = x + "";
        StringBuffer str = new StringBuffer();
        char[] chars = new char[y.length()];
        for (int i = 0; i < y.length(); i++) {
            chars[i] = (y.charAt(i));
        }

        for (int i = chars.length - 1; i >= 0; i--) {
            str.append(chars[i]);
        }


        return Integer.parseInt(str.toString());
    }


    public static void main(String[] args) {
        LeetCode7 leetCode7 = new LeetCode7();
        int reverse = leetCode7.reverse(321);
        System.out.println(reverse);

    }
}
