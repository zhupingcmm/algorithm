package com.mf.algorithm;

public class LowestCommonAncestor235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;
        if (p.val < root.val && q.val < root.val) {
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            if (left != null) return left;
        }

        if (p.val > root.val && q.val > root.val) {
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (right != null) return right;
        }


        return root;

    }
}
