package com.estbon.application.beautiful.leetcode;

import java.util.HashMap;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/9 19:39
 * @description
 */
public class LeetCode1 {

    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;

        int[] a = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                a[0] = map.get(temp);
                a[1] = i;
                return a;
            } else {
                map.put(nums[i], i);
            }

        }
        return a;


    }

    public static void main(String[] args) {
        LeetCode1 leetCode1 = new LeetCode1();
        int[] arr = {2, 3, 4, 5};

        int[] ints = leetCode1.twoSum(arr, 6);
        for (int a : ints) {
            System.out.println(a);
        }

    }
}
