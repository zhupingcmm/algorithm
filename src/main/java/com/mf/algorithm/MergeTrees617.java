package com.mf.algorithm;

public class MergeTrees617 {

    TreeNode treeNode = new TreeNode(-1);
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        treeNode.val = root1.val + root2.val;

        treeNode.left = mergeTrees(root1.left, root2.left);
        treeNode.right = mergeTrees(root1.right, root2.right);
        return treeNode;

    }
}
