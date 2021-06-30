package com.estbon.application.beautiful.queue;

import lombok.Data;

/**
 * @author liushuaishuai
 * @date 2021/6/26 23:43
 */
@Data

public class ListNode {

    int val;

    ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }

}
