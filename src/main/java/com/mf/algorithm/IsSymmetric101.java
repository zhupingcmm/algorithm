package com.mf.algorithm;

public class IsSymmetric101 {


    public boolean isSymmetric(TreeNode root) {

        return isSymmetric(root.left, root.right);


    }


    private boolean isSymmetric (TreeNode left, TreeNode right) {
        if (left == null && right != null) return false;
        if (left != null && right == null) return false;
        if (left == null && right == null) return true;
        if (left.val != right.val) return false;

        boolean leftResult = isSymmetric(left.left, right.right);
        boolean rightResult = isSymmetric(left.right, right.left);

        return leftResult && rightResult;
    }


}
