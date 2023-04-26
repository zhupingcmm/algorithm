package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsSymmetric101 {


    public boolean isSymmetric(TreeNode root) {
       return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right != null) return false;
        if (left != null && right == null) return false;
        if (left == null && right == null) return true;
        if (left.val != right.val) return false;

        boolean leftRes = isSymmetric(left.left, right.right);
        boolean rightRes = isSymmetric(left.right, right.left);

        return leftRes && rightRes;
    }









}
