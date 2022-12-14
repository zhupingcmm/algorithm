package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FindMode501 {
    private TreeNode pre;
    private int count = 0;

    private int maxCount = Integer.MIN_VALUE;
    private List<Integer> result = new ArrayList<>();

    public int[] findMode(TreeNode root) {

        bfs(root);
        int [] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }


    private void bfs (TreeNode root) {
        if (root == null) return;

        bfs(root.left);
        if (pre == null || pre.val != root.val) {
            count = 1;
        } else {
            count ++;
        }
        pre = root;


        if (count > maxCount) {
            result.clear();
            result.add(root.val);
            maxCount = count;
        } else if (count == maxCount) {
            result.add(root.val);
        }

        bfs(root.right);
    }
}
