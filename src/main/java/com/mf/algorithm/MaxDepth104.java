package com.mf.algorithm;

public class MaxDepth104 {

    public int maxDepth(TreeNode root) {
        int max = Integer.MIN_VALUE;

        dfs(root, 1, max);
        return max;
    }

    public void dfs (TreeNode node, int cur, int max) {
        if (node == null) return;
        max = Math.max(cur, max);
        if (node.left != null) { dfs(node.left, cur + 1, max);}
        if (node.right != null) { dfs(node.right, cur + 1, max);}
    }
}
