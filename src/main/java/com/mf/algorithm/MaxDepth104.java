package com.mf.algorithm;

import java.util.LinkedList;

public class MaxDepth104 {
    private int max = Integer.MIN_VALUE;

    public int maxDepth(TreeNode root) {
        dfs(0, root);
        return max;
    }

    public void  dfs (int level, TreeNode node) {
        if (node == null) {
            return;
        }

        max = Math.max(level, max);

        if (node.left != null) {
            dfs(level + 1, node.left);
        }

        if (node.right != null) {
            dfs(level + 1, node.right);
        }
    }



}
