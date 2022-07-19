package com.mf.algorithm;

import java.util.LinkedList;

public class MaxDepth104 {
    private int max = Integer.MIN_VALUE;

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        dfs(root, 1);
        return max;
    }

    private void dfs(TreeNode root, int cur) {
        if (root == null) return;
        max = Math.max(max, cur);
        if (root.left != null) { dfs(root.left, cur + 1);}
        if (root.right != null) { dfs(root.right, cur + 1);}
    }

    private void bfs(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int cur = 0;
        while (!queue.isEmpty()) {
            cur = cur + 1;
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {

                TreeNode treeNode = queue.poll();
                if(treeNode.left != null){
                    queue.offer(treeNode.left);
                }
                if(treeNode.right != null){
                    queue.offer(treeNode.right);
                }

            }
            max = Math.max(cur, max);
        }
    }
}
