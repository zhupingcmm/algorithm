package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {

    private List<String> result = new ArrayList<>();
    private List<Integer> paths = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root);
        return result;
    }


    private void dfs(TreeNode root) {
        paths.add(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < paths.size(); i++) {
                sb.append(paths.get(i));
                if (paths.size() -1 != i) {
                    sb.append("->");
                }
            }

            result.add(sb.toString());
            return;
        }
        if (root.left != null) {
            dfs(root.left);
            paths.remove(paths.size() -1);
        }

        if (root.right != null) {
            dfs(root.right);
            paths.remove(paths.size() -1);
        }
    }





}
