package com.estbon.application.bean;

import lombok.Data;

/**
 * @author liushuaishuai
 * @date 2019/3/5 23:21
 * <p>
 * remark: https://leetcode.com/problems/reverse-linked-list/
 */
@Data
public class ListNode {

    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}
