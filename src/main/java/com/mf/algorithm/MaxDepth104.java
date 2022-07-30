package com.mf.algorithm;

import java.util.LinkedList;

public class MaxDepth104 {
    private int max = Integer.MIN_VALUE;

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return max;
    }

    private void dfs (int level, TreeNode root) {
        if (root == null) {
            return;
        }
        max = Math.max(max, level);

        if (root.left != null ) {
            dfs(level + 1, root.left);
        }

        if (root.right != null) {
            dfs(level + 1, root.right);
        }

    }


}
