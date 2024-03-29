package com.mf.algorithm;

public class LowestCommonAncestor235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root.val > p.val && root.val > q.val) {
            TreeNode left =  lowestCommonAncestor(root.left, p, q);
           if ( left != null) return left;
        }

        if (root.val < p.val && root.val < q.val) {
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (right != null) return right;
        }

        return root;
    }
}
