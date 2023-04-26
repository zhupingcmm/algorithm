package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        List<Integer> nodes = new ArrayList<>();
        dfs(root, paths, nodes);
        return paths;
    }


    private void dfs(TreeNode root, List<String> paths, List<Integer> nodes) {
        nodes.add(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nodes.size(); i++) {
                sb.append(nodes.get(i));
                if (i != nodes.size() -1 ) {
                    sb.append("->");
                }
            }
            paths.add(sb.toString());
        }

        if (root.left != null) {
            dfs(root.left, paths, nodes);
            nodes.remove(nodes.size() -1);
        }

        if (root.right != null) {
            dfs(root.right, paths, nodes);
            nodes.remove(nodes.size() -1);
        }

    }





}
