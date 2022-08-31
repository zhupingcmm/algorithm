package com.mf.algorithm;

import java.util.*;

public class PathSum {

    List<List<Integer>> ret = new LinkedList<>();
    Deque<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return ret;
    }

    private void dfs(TreeNode root, int targetSum) {
        if (root == null) return;

        path.offerLast(root.val);
        targetSum -= root.val;

        if (root.left == null && root.right ==null && targetSum == 0) {
            ret.add(new LinkedList<>(path));
        }

        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        path.pollLast();
    }
}
