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

        while (!queue.isEmpty()){

            int currentSize = queue.size();

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < currentSize; i++) {

                TreeNode treeNode = queue.poll();

                max = Math.max(max, treeNode.val);
                if (treeNode.left != null) queue.offer(treeNode.left);
                if (treeNode.right != null) queue.offer(treeNode.right);

            }

            result.add(max);
        }

        return result;
    }
}
