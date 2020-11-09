package com.estbon.application.beautiful.leetcode;

/**
 * @author liushuaishuai
 * @date 2020/11/9 16:51
 */
public class Solution35 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 8, 9, 13};
        int response = searchInsert(arr, 11);
        System.out.println(response);
    }


    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (value > target) {
                return 0;
            }
            if (value == target) {
                return i;
            }
            if (value < target) {
                if (i < nums.length - 1) {
                    int after = nums[i + 1];
                    if (after >= target) {
                        return i + 1;
                    }
                }
            }
        }
        return nums.length;
    }
}
