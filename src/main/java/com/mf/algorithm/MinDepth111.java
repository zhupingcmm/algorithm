package com.mf.algorithm;

import java.util.LinkedList;

public class MinDepth111 {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if (root.left == null && root.right != null) return rightDepth + 1;
        if (root.left != null && root.right == null) return leftDepth + 1;
        return Math.min(leftDepth, rightDepth) + 1;

    }


    private int bfs (TreeNode root) {
        int depth = 0;
        if (root == null) return depth;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty() && flag) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    flag = false;
                    break;
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null)queue.offer(node.right);
            }
            depth++;

        }


        return depth;

    }

}
