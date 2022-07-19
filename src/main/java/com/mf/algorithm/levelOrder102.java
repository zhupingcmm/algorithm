package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class levelOrder102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int currentSize = queue.size();

            for (int i = 0; i < currentSize; i++) {
                TreeNode currentNode = queue.poll();
                res.add(currentNode.val);
                if (null != currentNode.left) {
                    queue.offer(currentNode.left);
                }
                if (null != currentNode.right) {
                    queue.offer(currentNode.right);
                }
            }

            result.add(res);
        }

        return result;
    }
}
