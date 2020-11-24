package com.estbon.application.beautiful.leetcode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liushuaishuai
 * @date 2020/11/24 15:27
 */
public class Solution222 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        root.setLeft(treeNode2);
        root.setRight(treeNode3);
        treeNode2.setLeft(treeNode4);
        treeNode2.setRight(treeNode5);
        treeNode3.setLeft(treeNode6);

        Solution222 example = new Solution222();
        System.out.println(example.countNodes(root));
    }


    public Integer countNodes(TreeNode root) {
        AtomicInteger count = new AtomicInteger();
        if (root == null) {
            return count.get();
        }
        count.addAndGet(1);
        countNodeRecursion(root, count);
        return count.get();
    }

    private void countNodeRecursion(TreeNode treeNode, AtomicInteger count) {
        if (treeNode.left != null) {
            count.addAndGet(1);
            countNodeRecursion(treeNode.left, count);
        }
        if (treeNode.right != null) {
            count.addAndGet(1);
            countNodeRecursion(treeNode.right, count);
        }
    }
}
