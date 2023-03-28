package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        System.out.println(result.toString());
        dfs(root, result);
        return result;
    }

    private void dfs (TreeNode node, List<Integer> result) {
        if (node == null) return;
        dfs(node.left, result);
        dfs(node.right, result);
        result.add(node.val);
    }
}
