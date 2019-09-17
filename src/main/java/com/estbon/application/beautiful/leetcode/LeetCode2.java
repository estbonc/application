package com.estbon.application.beautiful.leetcode;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/4/9 12:30
 * @description
 */
public class LeetCode2 {

    //    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//    输出：7 -> 0 -> 8
//    原因：342 + 465 = 807

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
        ListNode listNode = leetCode2.addTwoNumbers2(listNode1, listNode2);

        System.out.println(listNode.toString());


    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }






}
