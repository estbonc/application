package com.estbon.application.beautiful.leetcode;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/9 19:40
 * @description https://leetcode.com/problems/reverse-integer/
 */
public class LeetCode7 {

    public int reverse(int x) {

        boolean negative = false;
        String y = String.valueOf(x);
        if (y.startsWith("-")) {
            negative = true;
            y = y.replaceAll("-", "");
        }

        StringBuffer str = new StringBuffer();
        char[] chars = new char[y.length()];
        for (int i = 0; i < y.length(); i++) {
            chars[i] = (y.charAt(i));
        }

        for (int i = chars.length - 1; i >= 0; i--) {
            str.append(chars[i]);
        }
        String s = str.toString();
        if (negative) {
            s = "-" + str.toString();
        }
        long i  = Long.parseLong(s);
        if (i > Integer.MAX_VALUE || i < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) i;
    }


    public static void main(String[] args) {
        LeetCode7 leetCode7 = new LeetCode7();
        int reverse = leetCode7.reverse2(1234);
        System.out.println(reverse);

    }

    public int reverse2(int x) {
        long temp = 0;

        while(x != 0){
            int pop = x % 10;
            temp = temp * 10 + pop;

            if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
                return 0;
            }
            x /= 10;
        }
        return (int)temp;
    }
}
