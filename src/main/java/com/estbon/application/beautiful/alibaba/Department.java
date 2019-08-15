package com.estbon.application.beautiful.alibaba;

import lombok.Data;

import javax.swing.tree.TreeNode;
import java.util.List;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/3/14 10:48
 * @description
 */
@Data
public class Department {

    TreeNode parent;

    List<TreeNode> childNodeList;

}
