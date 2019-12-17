package com.estbon.application.beautiful.leetcode;

/**
 * @author liushuaishuai
 * @date 2019/12/16 18:18
 */
public class LeetCode26 {

    public static void main(String[] args) {

        int[] arr = {1};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return 1;
        }
        int point1 = 0;
        int point2 = 1;
        while (true) {
            if (nums[point2] == nums[point1]) {
                point2++;
            } else {
                nums[point1 + 1] = nums[point2];
                point1++;
                point2++;
            }
            if (point2 > length - 1) {
                return point1 + 1;
            }
        }
    }

}
