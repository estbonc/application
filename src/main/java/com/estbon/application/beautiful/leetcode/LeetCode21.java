package com.estbon.application.beautiful.leetcode;

/**
 * @author liushuaishuai
 * @date 2019/12/16 16:03
 */
public class LeetCode21 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node2.setNext(node3);
        node1.setNext(node2);

        node5.setNext(node6);
        node4.setNext(node5);

        ListNode listNode = mergeTwoLists(node1, node4);
        System.out.println(listNode);

    }


    public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}
