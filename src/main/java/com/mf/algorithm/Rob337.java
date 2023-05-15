package com.mf.algorithm;

public class Rob337 {
    public int rob(TreeNode root) {
        int [] nums = dfs(root);
        return Math.max(nums[0], nums[1]);
    }

    private int[] dfs(TreeNode root) {
        if (root == null) return new int[2];

       int [] left = dfs(root.left);
       int [] right = dfs(root.right);

        int rob = left[0] + right[0] + root.val;
        int noRob = Math.max(left[1], left[0]) + Math.max(right[1], right[0]);
        return new int[]{rob,noRob};

    }
}
