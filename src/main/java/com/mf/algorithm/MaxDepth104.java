package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth104 {



    public int maxDeptDfs(TreeNode root) {
        if (root == null) return 0;

       int left = maxDeptDfs(root.left);
       int right = maxDeptDfs(root.right);
       return Math.max(left, right) + 1;



    }


    public int maxDepthBfs(TreeNode root){
        int maxDepth = 0;
        if (root == null) return maxDepth;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            maxDepth++;
        }



        return maxDepth;
    }








}
