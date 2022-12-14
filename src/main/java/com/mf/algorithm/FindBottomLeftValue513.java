package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftValue513 {
//    public int findBottomLeftValue(TreeNode root) {
//       return findBottomLeftValueDfs(root);
//    }


    public int findBottomLeftValueBfs(TreeNode root) {
//
        int result = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) result = node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }


        return result;
    }
}
