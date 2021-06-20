package com.estbon.application.beautiful.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liushuaishuai
 * @date 2021/6/20 13:13
 */
public class SlidingWindow {

    public static void main(String[] args) {

        int[] arr = new int[]{1,3,-1,-3,5,3};
        int k = 3;
        SlidingWindow slidingWindow = new SlidingWindow();
        System.out.println(Arrays.toString(slidingWindow.maxSlidingWindow(arr, k)));
    }
    // 单调队列使用双端队列来实现
    private ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
    // 入队的时候，last方向入队，但是入队的时候
    // 需要保证整个队列的数值是单调的
    // (在这个题里面我们需要是递减的)
    // 并且需要注意，这里是Q.getLast() < val
    // 如果写成Q.getLast() <= val就变成了严格单调递增
    private void push(int val) {
        while (!queue.isEmpty() && queue.getLast() < val) {
           queue.removeLast();
        }
        // 将元素入队
       queue.addLast(val);
    }
    // 出队的时候，要相等的时候才会出队
    private void pop(int val) {
        if (!queue.isEmpty() &&queue.getFirst() == val) {
           queue.removeFirst();
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            push(nums[i]);
            // 如果队列中的元素还少于k个
            // 那么这个时候，还不能去取最大值
            if (i < k - 1) {
                continue;
            }
            // 队首元素就是最大值
            ans.add(queue.getFirst());
            // 尝试去移除元素
            pop(nums[i - k + 1]);
        }
        // 将ans转换成为数组返回!
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }


}
