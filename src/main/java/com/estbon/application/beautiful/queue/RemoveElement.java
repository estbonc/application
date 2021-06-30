package com.estbon.application.beautiful.queue;


/**
 * @author liushuaishuai
 * @date 2021/6/26 23:40
 */
public class RemoveElement {

    public static void main(String[] args) {

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(2);
        ListNode a5 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        System.out.println(removeElements(a1, 2));
    }


    public static ListNode removeElements(ListNode head, int val) {
        // 生成一个新链表
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        // 依次取出旧链表中的每个结点
        ListNode p = head;
        while (p != null) {
            ListNode back = p.next;
            // 如果结点值需要保留，那么采用属部追加的方法
            // 添加到新链表中
            if (p.val != val) {
                tail.next = p;
                tail = p;
            }
            p = back;
        }
        // 注意设置尾巴的next为空
//        tail.next = null;
        // 注意返回的是dummy.next
        return dummy.next;

    }
}