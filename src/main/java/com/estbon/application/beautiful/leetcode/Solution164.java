package com.estbon.application.beautiful.leetcode;

import java.util.Arrays;

/**
 * @author liushuaishuai
 * @date 2020/11/26 14:46
 */
public class Solution164 {

    public static void main(String[] args) {

        int[] arr = {3, 6, 9, 1, 88};

        Solution164 solution164 = new Solution164();
        System.out.println(solution164.maximumGap(arr));

    }

    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int value = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int tmp = nums[i + 1] - nums[i];
            if (tmp > value) {
                value = tmp;
            }
        }
        return value;
    }

}
