package com.estbon.application.beautiful.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author liushuaishuai
 * @date 2021/5/25 17:50
 * <p>
 * 中序遍历
 */
public class Solution94 {


    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
//        TreeNode treeNode9 = new TreeNode(9);
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode5.left = treeNode7;
        treeNode5.right = treeNode8;
        treeNode1.right = treeNode3;
        treeNode3.right = treeNode6;
        Solution94 solution94 = new Solution94();
        List<Integer> integers = solution94.inOrderTraverse2(treeNode1);

    }

    /**
     * 前序
     *
     * @param root .
     */
    public void preOrderTraverse2(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode pNode = root;
        while (pNode != null || !stack.isEmpty()) {
            if (pNode != null) {
                System.out.print(pNode.val + "  ");
                stack.push(pNode);
                pNode = pNode.left;
            } else { //pNode == null && !stack.isEmpty()
                TreeNode node = stack.pop();
                pNode = node.right;
            }
        }
    }

    /**
     * 中序
     *
     * @param root .
     * @return .
     */
    public List<Integer> inOrderTraverse2(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode pNode = root;
        while (pNode != null || !stack.isEmpty()) {
            if (pNode != null) {
                stack.push(pNode);
                pNode = pNode.left;
            } else { //pNode == null && !stack.isEmpty()
                TreeNode node = stack.pop();
                System.out.print(node.val + "  ");
                result.add(node.val);
                pNode = node.right;
            }
        }
        return result;
    }
}
