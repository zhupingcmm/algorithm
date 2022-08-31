package com.mf.algorithm;

import java.util.LinkedList;

public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
//        return dfs(root, targetSum);
        return bfs(root, targetSum);

    }

    private boolean bfs(TreeNode root, int targetSum){
        if (root==null) return false;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        LinkedList<Integer> sumQueue = new LinkedList<>();
        sumQueue.offer(0);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                Integer sum = sumQueue.poll();
                if (poll.left==null && poll.right==null && (poll.val+sum) == targetSum){
                    return true;
                }
                if (poll.left!=null){
                    queue.offer(poll.left);
                    sumQueue.offer(sum+poll.val);
                }
                if (poll.right!=null){
                    queue.offer(poll.right);
                    sumQueue.offer(sum+poll.val);
                }
            }
        }
        return false;

    }
    private boolean dfs(TreeNode root, int targetSum){
        if (root == null) return false;
        if (root.left == null && root.right == null) return targetSum-root.val ==0;
        return hasPathSum(root.left , targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
