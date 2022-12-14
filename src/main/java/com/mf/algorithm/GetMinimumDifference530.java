package com.mf.algorithm;

public class GetMinimumDifference530 {
    private long result = Long.MAX_VALUE;
    TreeNode pre = null;
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;


        getMinimumDifference(root.left);
        if (pre != null) {
            result = Math.min(result, root.val - pre.val);
        }
        pre = root;
        getMinimumDifference(root.right);

        return (int) result;
    }
}
