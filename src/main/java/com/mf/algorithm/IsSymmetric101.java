package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsSymmetric101 {


    public boolean isSymmetric(TreeNode root) {

        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right != null) return false;
        if (left != null && right == null) return false;
        if (left == null && right == null) return true;
        if (left.val != right.val) return false;

        boolean lRes = isSymmetric(left.left, right.right);
        boolean rRes = isSymmetric(left.right, right.left);
        return lRes && rRes;

    }

    private boolean isSymmetricBfs(TreeNode root){
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<TreeNode> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            if (!compare(list)) return false;
        }
        return true;
    }

    private boolean compare(List<TreeNode> list) {
        if (list.size() % 2 != 0 ) return false;
        int left = 0;
        int right = list.size() -1;
        while (left < right) {
            if (list.get(left++) != list.get(right--)) {
                return false;
            }
        }
        return true;
    }


}
