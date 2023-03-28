package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth104 {

//    public int maxDepth(TreeNode root) {
//
//        return null;
//    }



    private int dfs(TreeNode root){
        if (root == null) return 0;
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    private int bfs(TreeNode root) {
        int dep = 0;
        if (root == null) return dep;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            dep++;
        }

        return dep;
    }




}
