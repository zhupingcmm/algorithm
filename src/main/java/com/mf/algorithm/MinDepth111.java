package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth111 {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left == null && root.right != null) return right + 1;
        if (root.left != null && root.right == null) return left + 1;
        return Math.min(left, right) + 1;
    }


    private int bfs (TreeNode root) {
        int midDepth = 0;
        if (root == null) return midDepth;

        boolean flag = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty() && flag) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    flag = false;
                    break;
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            midDepth++;
        }

        return midDepth;



    }

}
