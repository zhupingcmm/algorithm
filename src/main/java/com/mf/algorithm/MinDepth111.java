package com.mf.algorithm;

public class MinDepth111 {
    private int min = 0;
    public int minDepth(TreeNode root) {

    }

    private void dfs (TreeNode root, int curLevel) {
        if (root == null) {
            min = Math.min(curLevel, min);
            return;
        }
        if (root.left != null) { dfs(root.left, curLevel + 1);}
        if (root.right != null) { dfs(root.right, curLevel + 1);}
    }
}
