package com.estbon.application.bean;

import java.util.PriorityQueue;

/**
 * @author liushuaishuai
 * @date 2019/3/7 23:25
 * <p>
 * remark:
 */
public class KthLargest {

    //Deque 双端队列
    final PriorityQueue<Integer> q;

    final int k;

    public KthLargest(int k, int[] a) {
        this.k = k;
        q = new PriorityQueue<>(k);
        for(int n : a){
            add(n);
        }
    }


    public int add(int n){
        if(q.size() < k){
            q.offer(n);
        }else if(q.peek() < n){
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }

}
