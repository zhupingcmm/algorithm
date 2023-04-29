package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FindMode501 {
    private int maxCount = Integer.MIN_VALUE;
    TreeNode pre = null;
    private int count = 0;
    private List<Integer> result = new ArrayList<>();
    public int[] findMode(TreeNode root) {

        dfs(root);
        int [] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;

    }

    private void dfs(TreeNode root) {
        if (root == null) return;

        dfs(root.left);
        if (pre != null && pre.val == root.val) {
            count++;
        } else {
            count = 1;
        }

        if (count == maxCount) {
            result.add(root.val);
        } else if (count > maxCount) {
            result.clear();
            result.add(root.val);
            maxCount = count;
        }
        pre = root;
        dfs(root.right);
    }






}
