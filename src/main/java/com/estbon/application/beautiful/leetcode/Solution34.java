package com.estbon.application.beautiful.leetcode;

import java.util.Arrays;

/**
 * @author liushuaishuai
 * @date 2020/12/1 15:54
 */
public class Solution34 {

    public static void main(String[] args) {
        int[] arr = {7, 8, 8, 9};


        Solution34 solution34 = new Solution34();
        System.out.println(Arrays.toString(solution34.searchRange2(arr, 8)));

    }


    public int[] searchRange2(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (start == -1 && nums[i] == target) {
                start = i;
            }
            if (end == -1 && nums[nums.length - i - 1] == target) {
                end = nums.length - i - 1;
            }
            if (start != -1 && end != -1) {
                return new int[]{start, end};
            }
            if (i * 2 >= nums.length) {
                return new int[]{start, end};
            }
        }
        return new int[]{start, end};
    }


    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target && start == -1) {
                continue;
            }
            if (nums[i] != target && end != -1) {
                return new int[]{start, end};
            }
            if (nums[i] == target && start == -1) {
                start = i;
                end = i;
                continue;
            }
            if (nums[i] == target) {
                end = i;
            }
        }
        return new int[]{start, end};
    }

}
