package com.mf.algorithm;

import java.util.LinkedList;

public class MinDepth111 {
    private int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {

        if (root == null) return 0;
        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);
        if (root.left == null && root.right != null ) {
            return rightHeight + 1;
        }
        if (root.left != null && root.right == null ) return leftHeight + 1;
        return Math.min(leftHeight, rightHeight) + 1;
    }


    private void dfs (TreeNode root, int level) {
        if (root == null) {
            min = Math.min(level, min);
            return;
        }

        if (root.left != null) {
            dfs(root.left, level + 1);
        }

        if (root.right != null) {
            dfs(root.right, level + 1);
        }
    }

    private void bfs (TreeNode root) {

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);


        boolean cut = false;
        while (!queue.isEmpty() && !cut) {
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = queue.poll();
                if (node.left == null || node.right == null) {
                    cut = true;
                    return;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
                min ++;
            }
        }
    }

}
