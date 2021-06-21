package com.estbon.application.beautiful.queue;

import com.google.common.collect.Lists;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author liushuaishuai
 * @date 2021/6/14 20:44
 */
public class TreeTraverse {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        TreeNode treeNode = new TreeNode(8);
        node.right = treeNode;
        treeNode.setLeft(new TreeNode(6));
        treeNode.right = new TreeNode(7);
//        System.out.println(levelOrder(node));
//        System.out.println(levelOrder2(node));
        test();
    }

    public static void test() {

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1 > o2) {
                return 1;
            } else if (o1 < o2) {
                return -1;
            } else {
                return 0;
            }
        });

        queue.offer(1);
        queue.offer(8);
        queue.offer(9);
        queue.offer(4);
        queue.offer(6);
        System.out.println(queue);
    }


    public static List<List<Integer>> levelOrder2(TreeNode treeNode) {
        List<List<Integer>> res = new ArrayList<>();

        if (Objects.isNull(treeNode)) {
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(treeNode);
        while (queue.size() > 0) {
            int size = queue.size();
            List<Integer> value = Lists.newArrayList();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                value.add(poll.val);
                if (Objects.nonNull(poll.left)) {
                    queue.add(poll.left);
                }
                if (Objects.nonNull(poll.getRight())) {
                    queue.add(poll.right);
                }
            }
            res.add(value);
        }
        return res;
    }


    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> response = Lists.newLinkedList();
        //生成FIFO队列
        Queue<TreeNode> queue = new LinkedList<>();

        if (Objects.nonNull(root)) {
            queue.offer(root);
        }
        while (queue.size() > 0) {
            int size = queue.size();
            List<Integer> curr = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                curr.add(poll.val);
                if (poll.getLeft() != null) {
                    queue.offer(poll.getLeft());
                }
                if (poll.getRight() != null) {
                    queue.offer(poll.getRight());
                }
            }
            response.add(curr);
        }
        return response;
    }
}
