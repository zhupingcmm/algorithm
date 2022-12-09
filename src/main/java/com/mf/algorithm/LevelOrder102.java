package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {

               TreeNode node = queue.poll();
               res.add(node.val);
               if (node.left != null) queue.offer(node.left);
               if (node.right != null) queue.offer(node.right);
            }
            result.add(res);
        }

        return result;
    }
}
