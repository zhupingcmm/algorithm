package com.mf.algorithm;

import com.sun.jmx.snmp.SnmpNull;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree226 {


    public TreeNode invertTree(TreeNode root) {
        return dfs(root);
    }

    private TreeNode dfs(TreeNode root) {
        if (root == null) return null;
        dfs(root.left);
        dfs(root.right);
        swap(root);
        return root;

    }

    private void swap(TreeNode root) {
        TreeNode tem = root.left;
        root.left = root.right;
        root.right = tem;
    }

    private TreeNode bfs(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                swap(node);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

        }
        return root;
    }




}
