package com.mf.algorithm;

import java.util.LinkedList;

public class InvertTree226 {
    public static void main(String[] args) {
        InvertTree226 invertTree226 = new InvertTree226();
//        invertTree226.invertTree()
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return  root;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                TreeNode tmp = node.left;
                node.left = node.right;
                node.right = tmp;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }

            }
        }
        return root;
    }
}
