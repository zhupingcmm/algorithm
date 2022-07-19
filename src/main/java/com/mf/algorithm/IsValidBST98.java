package com.mf.algorithm;

public class IsValidBST98 {
    private TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if(!isValidBST(root.left)) return false;
        if (pre != null && root.val <= pre.val) return false;
        pre = root;
        return isValidBST(root.right);
    }
}
