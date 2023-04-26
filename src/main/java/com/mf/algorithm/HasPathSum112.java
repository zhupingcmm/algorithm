package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HasPathSum112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
//        return dfs(root, targetSum);
        return bfs(root, targetSum);

    }

    private boolean bfs(TreeNode root, int targetSum){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        Queue<Integer> nodes = new LinkedList<>();
        nodes.add(0);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int sum = nodes.poll();
                if (node.left == null && node.right == null && (sum + node.val) == targetSum  ) {
                    return true;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                    nodes.add(sum + node.val);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    nodes.add(sum + node.val);
                }
            }

        }

        return false;
    }
    private boolean dfs(TreeNode root, int targetSum){
        if (root == null) return  false;
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        if (root.left != null) {
            targetSum-= root.val;
            if (dfs(root.left, targetSum)) return true;
            targetSum += root.val;
        }

        if (root.right != null) {
            targetSum-= root.val;
            if (dfs(root.right, targetSum)) return true;
            targetSum += root.val;
        }

        return false;
    }
}
