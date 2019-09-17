package com.estbon.application.beautiful.leetcode;

/**
 * @author liushuaishuai
 * @date 2019/9/18 0:15
 * <p>
 * remark:
 */
public class LeetCode9 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int tmp = x;
        int temp = 0;
        while (x != 0) {
            int pop = x % 10;
            temp = temp * 10 + pop;
            x /= 10;
        }
        return temp == tmp;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-112211));
    }

}
