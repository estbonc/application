package com.estbon.application.beautiful.leetcode;


/**
 * @author liushuaishuai
 * @date 2020/4/5 9:51 上午
 */
public class LeetCode27 {


    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        LeetCode27 demo = new LeetCode27();
//        System.out.println(demo.removeElement(arr, 2));
        System.out.println(demo.removeElement2(arr, 2));
    }


    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public int removeElement2(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int length = nums.length;
        while (i < length) {
            if (nums[i] == val) {
                nums[i] = nums[length - 1];
                length--;
            } else {
                i++;
            }
        }
        return length;
    }

}
