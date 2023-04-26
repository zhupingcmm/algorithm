package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsValidBST98 {

    private TreeNode preNode = null;


    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
    return dfs(root);
    }

    private boolean dfs (TreeNode root) {
        if (root == null) return true;
        boolean left = dfs(root.left);
        if (pre != null && pre.val >= root.val) {
            return false;
        }
        pre = root;

        boolean right = dfs(root.right);

        return left && right;

    }

    private boolean bfs(TreeNode root) {

        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();


                if (node.left != null) {
                    if (node.left.val >= node.val) return false;
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    if (node.right.val <= node.val) return false;
                    queue.offer(node.right);
                }
            }
        }

        return true;

    }
}
