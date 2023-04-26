package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class SearchBST700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;

        TreeNode node = null;
        if (root.left != null && root.val > val) {
            node = searchBST(root.left, val);
        }

        if (root.right != null && root.val < val) {
            node = searchBST(root.right, val);
        }

        return node;

    }

//    public TreeNode searchBST(TreeNode root, int val) {
//        if (root == null) return null;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                if (node.val > val) {
//                    if (node.left != null) queue.offer(node.left);
//                } else if (node.val < val) {
//                    if (node.right != null) queue.offer(node.right);
//                } else {
//                    return node;
//                }
//            }
//        }
//
//        return null;
//    }
}
