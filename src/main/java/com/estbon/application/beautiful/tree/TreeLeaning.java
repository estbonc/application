package com.estbon.application.beautiful.tree;

import com.estbon.application.beautiful.TreeNode;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 树遍历相关学习
 *
 * @author liushuaishuai
 * @date 2021/6/28 11:35
 */
public class TreeLeaning {
    public static void main(String[] args) {
        TreeLeaning leaning = new TreeLeaning();
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        TreeNode treeNode = new TreeNode(8);
        node.right = treeNode;
        treeNode.setLeft(new TreeNode(6));
        treeNode.right = new TreeNode(7);
        List<Integer> value = Lists.newArrayList();

        leaning.preorderTraversal(node, value);
        System.out.println(value);
        System.out.println(leaning.preorderTraversal(node));
    }


    /**
     * 二叉树前序遍历 (递归方式)
     * 根->左->右
     *
     * @param root  .
     * @param value .
     */
    public void preorderTraversal(TreeNode root, List<Integer> value) {
        if (root != null) {
            value.add(root.val);
            preorderTraversal(root.left, value);
            preorderTraversal(root.right, value);
        }
    }

    /**
     * 二叉树前序遍历 (栈方式)
     * 根->左->右
     *
     * @param root .
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // 用来进行递归的栈
        Stack<TreeNode> s = new Stack<>();
        // 用来存放遍历的结果，不算在空间复杂度里面
        List<Integer> ans = new ArrayList<>();
        // 开始利用栈来进行遍历
        while (root != null || !s.empty()) {
            // 模拟递归的压栈过程
            while (root != null) {
                s.push(root);
                ans.add(root.val);
                root = root.left;
            }
            // 当无法压栈的时候，将root.right进行压栈
            root = s.peek();
            s.pop();
            root = root.right;
        }
        return ans;
    }


    /**
     * 二叉树中序遍历 (递归方式)
     * 左->根->右
     *
     * @param root  .
     * @param value .
     */
    public void inOrder(TreeNode root, List<Integer> value) {
        if (root != null) {
            inOrder(root.left, value);
            value.add(root.val);
            inOrder(root.right, value);
        }
    }

    /**
     * 二叉树中序遍历 (栈方式)
     * 左->根->右
     *
     * @param root .
     */
    public List<Integer> inOrderTraversal(TreeNode root) {
        // 用来进行递归的栈
        Stack<TreeNode> s = new Stack<>();
        // 用来存放遍历的结果，不算在空间复杂度里面
        List<Integer> ans = new ArrayList<>();
        // 开始利用栈来进行遍历   注意这里的判断条件，需要root或stack非空
        while (root != null || !s.empty()) {
            // 模拟递归的压栈过程
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            // 到达了最左边，把结点弹出来，进行遍历
            root = s.peek();
            s.pop();
            ans.add(root.val);
            // 转向右子树
            root = root.right;
        }
        // 返回遍历的结果
        return ans;
    }


    /**
     * 二叉树后序遍历 (递归方式)
     * 左->右->根
     *
     * @param root  .
     * @param value .
     */
    public void postorderTraversal(TreeNode root, List<Integer> value) {
        if (root != null) {
            postorderTraversal(root.left, value);
            postorderTraversal(root.right, value);
            value.add(root.val);
        }
    }

    /**
     * 二叉树后序遍历 (栈方式)
     * 左->右->根
     *
     * @param t .
     */
    public List<Integer> postorderTraversal(TreeNode t) {
        // 存放遍历的结果
        List<Integer> ans = new ArrayList<>();
        // pre表示遍历时前面一个已经遍历过的结点
        TreeNode pre = null;
        Stack<TreeNode> s = new Stack<>();
        // 如果栈中还有元素，或者当前结点t非空
        while (!s.isEmpty() || t != null) {
            // 顺着左子树走，并且将所有的元素压入栈中
            while (t != null) {
                s.push(t);
                t = t.left;
            }
            // 当没有任何元素可以压栈的时候
            // 拿栈顶元素，注意这里并不将栈顶元素弹出
            // 因为在迭代时，根结点需要遍历两次，这里需要判断一下
            // 右子树是否遍历完毕
            t = s.peek();
            // 如果要遍历当前结点，需要确保右子树已经遍历完毕
            // 1. 如果当前结点右子树为空，那么右子树没有遍历的必要
            // 需要将当前结点放到ans中
            // 2. 当t.right == pre时，说明右子树已经被打印过了
            // 那么此时需要将当前结点放到ans中
            if (t.right == null || t.right == pre) {
                // 右子树已经遍历完毕，放到ans中。
                ans.add(t.val);
                // 弹栈
                s.pop();
                // 因为已经遍历了当前结点，所以需要更新pre结点
                pre = t;
                // 已经打印完毕。需要设置为空，否则下一轮循环
                // 还会遍历t的左子树。
                t = null;
            } else {
                // 第一次走到t结点，不能放到ans中，因为t的右子树还没有遍历。
                // 需要将t结点的右子树遍历
                t = t.right;
            }
        }
        return ans;
    }

}


