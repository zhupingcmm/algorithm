package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LargestValues515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int curQueueSize = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < curQueueSize; i++) {
                TreeNode curTreeNode = queue.poll();
                max = Math.max(max, curTreeNode.val);
                if (curTreeNode.right != null) {
                    queue.offer(curTreeNode.right);
                }

                if (curTreeNode.left != null) {
                    queue.offer(curTreeNode.left);
                }
            }

            result.add(max);
        }

        return result;
    }
}
