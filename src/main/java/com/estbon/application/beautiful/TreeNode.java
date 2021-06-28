package com.estbon.application.beautiful;

import lombok.Data;

/**
 * @author liushuaishuai
 * @date 2020/11/24 15:28
 */
@Data
public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }
}
