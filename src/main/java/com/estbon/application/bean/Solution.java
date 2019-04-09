package com.estbon.application.bean;

import java.util.HashMap;

/**
 * @author liushuaishuai
 * @date 2019/3/5 23:20
 * <p>
 * remark: https://leetcode.com/problems/reverse-linked-list/
 */
public class Solution {


    public ListNode revertList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


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
        Solution solution = new Solution();
        int[] arr = {2, 3, 4, 5};

        int[] ints = solution.twoSum(arr, 6);
        for (int a : ints) {
            System.out.println(a);
        }

    }


}
