package com.estbon.application.beautiful.leetcode;

/**
 * @author liushuaishuai
 * @date 2020/12/3 11:14
 */
public class Solution204 {

    //输入：n = 10
    //输出：4
    //解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。


    public static void main(String[] args) {

        Solution204 solution204 = new Solution204();
        System.out.println(solution204.countPrimes(10));


    }

    public int countPrimes(int n) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (i <= 3) {
                if (i > 1) {
                    count++;
                }
                continue;
            }
            int sqrt = (int) Math.sqrt(i);
            int b = 0;
            for (int j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    b = 1;
                    break;
                }
            }
            if (b == 0) {
                count++;
            }
        }
        return count;
    }
}
