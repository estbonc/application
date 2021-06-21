package com.estbon.application.beautiful.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liushuaishuai
 * @date 2021/6/18 19:50
 */
public class SlideWindow {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, -1, 3, 5, 3};
        int k = 3;


    }


    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            //入队列
            while (!deque.isEmpty() && deque.getLast() < val) {
                deque.removeLast();
            }
            deque.addLast(val);

            if (i < k - 1) {
                continue;
            }
        }


        return null;
    }


}
