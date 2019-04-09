package com.estbon.application.leetcode;

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

}
