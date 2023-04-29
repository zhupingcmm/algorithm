package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaves404 {

    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) return 0;
        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);
        if (root.left != null && root.left.left == null && root.left.right == null) left = root.left.val;
        return left + right;
    }



    public int bfs (TreeNode root) {

        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null && node.left.left == null && node.left.right == null) {
                    sum+=node.left.val;
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return sum;
    }
}
