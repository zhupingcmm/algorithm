package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Stack;

public class IsValidBST98 {

    private long maxValue = Long.MIN_VALUE;
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


    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean left = isValidBST(root.left);
        if (pre != null && pre.val >= root.val) return false;
        pre = root;
        boolean right = isValidBST(root.right);
        return left && right;
    }

    private boolean dfs (TreeNode node) {
        if (node == null) return true;
        if (!dfs(node.left)) return false;
        if (node.val <= preNode.val) return false;
        preNode = node;
        return dfs(node.right);
    }

    private boolean bfs(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                TreeNode left = treeNode.left;
                TreeNode right = treeNode.right;
                if(left != null) {
                    if (left.val >= treeNode.val) return false;
                    queue.offer(left);
                }
                if (right != null) {
                    if (right.val <= treeNode.val) return false;
                    queue.offer(right);
                }
            }
        }
        return true;
    }
}
