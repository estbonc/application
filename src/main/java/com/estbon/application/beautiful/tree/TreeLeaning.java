package com.estbon.application.beautiful.tree;

import com.estbon.application.beautiful.TreeNode;

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


    /**
     * 二叉树前序遍历 (递归方式)
     * 根->左->右
     *
     * @param root  .
     * @param value .
     */
    public void preorderTraversal(TreeNode root, List<Integer> value) {

        while (root != null) {
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


}


