package com.mf.algorithm;

import java.util.LinkedList;

public class MaxDepth104 {
    private int max = Integer.MIN_VALUE;

    public int maxDepth(TreeNode root) {

        return max;
    }



    private void dfs (int level, TreeNode node) {
        if (node == null) return;
        max = Math.max(max, level);

        if (node.left != null) dfs(level + 1, node.left);
        if (node.right != null) dfs(level + 1, node.right);
    }

    private int bfs (TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            count++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return count;
    }

}
