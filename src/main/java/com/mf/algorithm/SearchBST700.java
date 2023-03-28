package com.mf.algorithm;

import java.util.LinkedList;

public class SearchBST700 {

//    public TreeNode searchBST(TreeNode root, int val) {
//        if (root == null) return null;
//        if(root.val == val) return root;
//
//        TreeNode node = null;
//        if(root.val > val && root.left != null) {
//            node = searchBST(root.left, val);
//        }
//
//        if (root.val < val && root.right != null) {
//           node = searchBST(root.right, val);
//        }
//
//        return node;
//
//    }

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = null;
        if (root == null) return node;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (val == treeNode.val) return treeNode;
                if (val < treeNode.val && treeNode.left != null) queue.offer(treeNode.left);
                if (val > treeNode.val && treeNode.right != null) queue.offer(treeNode.right);
            }
        }

        return node;

    }
}
