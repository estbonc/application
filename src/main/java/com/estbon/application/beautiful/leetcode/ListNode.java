package com.estbon.application.beautiful.leetcode;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author liushuaishuai
 * @date 2019/3/5 23:21
 * <p>
 * remark: https://leetcode.com/problems/reverse-linked-list/
 */
@Data
@Accessors(chain = true)
public class ListNode {

    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}
