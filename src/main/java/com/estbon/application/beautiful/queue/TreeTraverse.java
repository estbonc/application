package com.estbon.application.beautiful.queue;

import com.google.common.collect.Lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
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
        System.out.println(levelOrder(node));
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
