package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth104 {
    private int max = Integer.MIN_VALUE;

    public int maxDepth(TreeNode root) {

        return max;
    }


    private int dfs (TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);

        return Math.max(left, right) + 1;
    }


//    private void dfs (int level, TreeNode node) {
//        if (node == null) return;
//        max = Math.max(max, level);
//
//        if (node.left != null) dfs(level + 1, node.left);
//        if (node.right != null) dfs(level + 1, node.right);
//    }

    private int bfs (TreeNode root) {
        if (root == null) return 0;
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result++;
        }

        return result;
    }

}
