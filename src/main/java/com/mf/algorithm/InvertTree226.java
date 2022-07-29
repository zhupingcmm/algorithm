package com.mf.algorithm;

import java.util.LinkedList;

public class InvertTree226 {
    public static void main(String[] args) {
        InvertTree226 invertTree226 = new InvertTree226();
//        invertTree226.invertTree()
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size ; i++) {
                TreeNode treeNode = queue.poll();
                TreeNode temNode = treeNode.left;
                treeNode.left = temNode.right;
                treeNode.right = temNode;
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }

            }
        }
        return root;
    }
}
