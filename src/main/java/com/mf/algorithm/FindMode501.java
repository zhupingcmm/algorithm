package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FindMode501 {
    private TreeNode pre;
    private int count = 0;
    private int maxCount = Integer.MIN_VALUE;

    private List<Integer> result = new CopyOnWriteArrayList<>();


    public int[] findMode(TreeNode root) {
        dfs(root);

        int size = result.size();
        int [] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = result.get(i);
        }
        return res;

    }

    private void dfs(TreeNode root) {

        if(root == null) return;
        dfs(root.left);
        if (pre != null && pre.val == root.val ) {
            count ++;
        } else {
            count = 1;
        }
        pre = root;

        if (count > maxCount) {
              result.clear();
              result.add(root.val);
              maxCount = count;
        } else if(count == maxCount) {
            result.add(root.val);
        }

        dfs(root.right);
    }



}
