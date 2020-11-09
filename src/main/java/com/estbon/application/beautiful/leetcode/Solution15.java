package com.estbon.application.beautiful.leetcode;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author liushuaishuai
 * @date 2020/11/9 18:04
 */
public class Solution15 {

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(arr));


    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = Lists.newArrayList();
        // 两层循环
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[k];
                    if (a + b + c == 0) {
                        list.add(Lists.newArrayList(a, b, c));
                    }
                }
            }
        }
        return list;
    }

}
