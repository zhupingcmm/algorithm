package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        List<Integer> tem = new ArrayList<>();

        getTreePath(root, paths, tem);
        return paths;


    }

    private void getTreePath(TreeNode root, List<String> paths, List<Integer> tem) {
        tem.add(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tem.size(); i++) {
                sb.append(tem.get(i));
                if (i != tem.size() -1 ) {
                    sb.append("->");
                }
            }
            paths.add(sb.toString());
            return;
        }


       if (root.left != null) {
           getTreePath(root.left, paths, tem);
           tem.remove(tem.size() -1);
       }

       if (root.right != null) {
           getTreePath(root.right, paths, tem);
           tem.remove(tem.size() -1);
       }
    }
}
