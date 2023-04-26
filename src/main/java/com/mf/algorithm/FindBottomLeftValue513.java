package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftValue513 {

    private int maxDepth = Integer.MIN_VALUE;
    private int val;

    public int findBottomLeftValue(TreeNode root) {

      dfs(root, 0);
      return val;
    }

    private void dfs(TreeNode root, int level) {
        if (root.left == null && root.right == null) {
            if (level > maxDepth) {
                val = root.val;
                maxDepth = level;
            }
        }

        if (root.left != null) {
            level++;
            dfs(root.left, level);
            level--;
        }

        if (root.right != null) {
            level++;
            dfs(root.right, level);
            level--;
        }

    }



    public int findBottomLeftValueBfs(TreeNode root) {
        int val = Integer.MIN_VALUE;
//        if (root == null) return
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) val = node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);

            }
        }

        return val;


    }
}
