package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class levelOrder102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> res = new ArrayList<>();
            int currentLevelSize = queue.size();
            for (int i =0; i< currentLevelSize; i++) {
                TreeNode curTreeNode = queue.poll();
                res.add(curTreeNode.val);
                if (curTreeNode.left != null) {
                    queue.offer(curTreeNode.left);
                }
                if (curTreeNode.right != null) {
                    queue.offer(curTreeNode.right);
                }
            }
            result.add(res);
        }
        return result;
    }
}
