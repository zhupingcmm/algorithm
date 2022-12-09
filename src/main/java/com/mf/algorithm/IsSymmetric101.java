package com.mf.algorithm;

public class IsSymmetric101 {


    public boolean isSymmetric(TreeNode root) {

        return  isSymmetric(root.left, root.right);

    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right != null) return false;
        if (left != null && right == null) return false;
        if (left == null && right == null) return true;
        if (left.val != right.val) return false;
        boolean outSide = isSymmetric(left.left, right.right);
        boolean inSide = isSymmetric(left.right, right.left);
        return outSide && inSide;
    }

}
