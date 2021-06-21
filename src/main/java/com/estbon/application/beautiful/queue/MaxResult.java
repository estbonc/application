package com.estbon.application.beautiful.queue;

import java.util.ArrayDeque;

/**
 * @author liushuaishuai
 * @date 2021/6/20 14:18
 */
public class MaxResult {

    public static void main(String[] args) {
        int[] arr = new int[]{1, -1, -100, -100000, 100, 3};
        int k = 2;
//        int s = k--;
//        System.out.println(s);
        System.out.println(maxResult(arr, k));
    }


    public static int maxResult(int[] A, int k) {
        //处理掉各种边界条件!
        if (A == null || A.length == 0 || k <= 0) {
            return 0;
        }
        final int N = A.length;
        //每个位置可以收集到的金币数目
        int[] get = new int[N];
        //单调队列，这里并不是严格递减
        ArrayDeque<Integer> Q = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            //在取最大值之前，需要保证单调队列中都是有效值。
            //也就是都在区间里面的值
            //当要求get[i]的时候，
            //单调队列中应该是只能保存[i-k,i-1]这个范围
            if (i - k > 0) {
                if (!Q.isEmpty() && Q.getFirst() == get[i - k - 1]) {
                    Q.removeFirst();
                }
            }
            //从单调队列中取得较大值
            int old = Q.isEmpty() ? 0 : Q.getFirst();
            get[i] = old + A[i];
            //入队的时候，采用单调队列入队
            while (!Q.isEmpty() && Q.getLast() < get[i]) {
                Q.removeLast();
            }
            Q.addLast(get[i]);
        }
        return get[N - 1];
    }
}
