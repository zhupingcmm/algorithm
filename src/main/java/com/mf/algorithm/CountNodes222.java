package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes222 {

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;

    }

    private int bfs(TreeNode root){
        int count = 0;
        if (root == null) return count;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                count++;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return count;


    }

}
