package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

public class LevelOrder102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> reesult = new CopyOnWriteArrayList<>();

        if (root == null) return reesult;
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.push(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> res = new CopyOnWriteArrayList<>();
            for (int i = 0; i < size; i++) {

                TreeNode node =  queue.poll();

                res.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null)queue.add(node.right);
            }
            reesult.add(res);


        }

        return reesult;
    }
}
