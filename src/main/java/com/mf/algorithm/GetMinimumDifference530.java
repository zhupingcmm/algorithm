package com.mf.algorithm;

public class GetMinimumDifference530 {

    TreeNode pre = null;
    int minVal = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return minVal;


    }

    private void dfs(TreeNode root){
        if (root == null) return;

        dfs(root.left);
        if (pre != null) {
            minVal = Math.min(minVal, Math.abs(pre.val - root.val));
        }
        pre = root;
        dfs(root.right);
    }


}
