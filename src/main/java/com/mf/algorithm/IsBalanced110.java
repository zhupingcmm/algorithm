package com.mf.algorithm;

public class IsBalanced110 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight (TreeNode root) {
        if (root == null) return 0;
        int left = getHeight(root.left);
        if (left==-1) return -1;
        int right = getHeight(root.right);
        if (right == -1) return -1;

        if (Math.abs(left -right) > 1) return -1;
        return Math.max(left, right) + 1;
    }

}
