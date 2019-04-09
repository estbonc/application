package com.estbon.application.leetcode;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/9 12:30
 * @description
 */
public class LeetCode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode answerRoot = null;

        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            ListNode next = new ListNode((l2 == null ? 0 : l2.val) + (l1 == null ? 0 : l1.val) + carry);
            carry = next.val / 10;
            next.val = next.val % 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            if (answer != null) {
                answer.next = next;
            }

            answer = next;

            if (answerRoot == null) {
                answerRoot = answer;
            }
        }

        if (answerRoot == null) {
            answerRoot = new ListNode(0);
        }

        return answerRoot;

    }


    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3)));

        ListNode listNode2 = new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));

        LeetCode2 leetCode2 = new LeetCode2();
        ListNode listNode = leetCode2.addTwoNumbers(listNode1, listNode2);

        System.out.println(listNode.toString());


    }

}
