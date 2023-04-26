package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FindMode501 {

    private List<Integer> res = new ArrayList<>();
    private int count = 0;
    private int maxCount = Integer.MIN_VALUE;
    TreeNode pre = null;
    public int[] findMode(TreeNode root) {
        dfs(root);
        int [] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;

        dfs(root.left);
        if (pre != null && pre.val == root.val ) {
            count ++;
        } else {
            count = 1;
        }
        if (count > maxCount) {
            maxCount = count;
            res.clear();
            res.add(root.val);
        } else if (count == maxCount) {
            res.add(root.val);
        }
        pre = root;

        dfs(root.right);
    }



}
