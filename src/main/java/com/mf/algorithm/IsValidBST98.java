package com.mf.algorithm;

import java.util.Stack;

public class IsValidBST98 {
    private TreeNode preNode = null;
//    public boolean isValidBST(TreeNode root) {
//
//        if (root == null) return true;
//        if (!isValidBST(root.left)) return  false;
//
//        if (preNode !=null && preNode.val >= root.val) return false;
//
//        preNode = root;
//        return isValidBST(root.right) && isValidBST(root.left);
//    }


    public boolean isValidBST(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (preNode != null && root.val <= preNode.val) return false;
            preNode = root;
            root = root.right;
        }

        return true;
    }
}
