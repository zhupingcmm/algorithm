package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree226 {
    public static void main(String[] args) {
        InvertTree226 invertTree226 = new InvertTree226();
//        invertTree226.invertTree()
    }



    public TreeNode invertTreeDfs(TreeNode root) {
        if (root == null) return null;

        swap(root);
        invertTreeDfs(root.left);
        invertTreeDfs(root.right);
        return root;
    }

    private void swap(TreeNode node){
        TreeNode temp  = node.left;
        node.left = node.right;
        node.right = temp;
    }

    public TreeNode invertTreeBfs(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);

            }

        }

        return root;
    }




}
