package com.estbon.application.beautiful.queue;

import lombok.Data;

/**
 * @author liushuaishuai
 * @date 2020/11/24 15:28
 */
@Data
public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
