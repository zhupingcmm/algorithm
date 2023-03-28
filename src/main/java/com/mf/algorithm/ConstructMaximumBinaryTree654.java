package com.mf.algorithm;

public class ConstructMaximumBinaryTree654 {

    public static void main(String[] args) {
        ConstructMaximumBinaryTree654 constructMaximumBinaryTree654 = new ConstructMaximumBinaryTree654();
        TreeNode node = constructMaximumBinaryTree654.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
        System.out.println(node);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 1) return new TreeNode(nums[0]);

        int maxVal = 0;
        int maxValIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > maxVal) {
                maxVal = nums[i];
                maxValIndex = i;
            }
        }

        // 中
        TreeNode node = new TreeNode(maxVal);

        if (maxValIndex > 0) {
            int [] newNums = getNumsByEnd(maxValIndex, nums);
            node.left = constructMaximumBinaryTree(newNums);
        }

        if (maxValIndex < nums.length -1) {
            int [] newNums = getNumsByStart(maxValIndex + 1, nums);
            node.right = constructMaximumBinaryTree(newNums);
        }

        return node;
    }

    private int[] getNumsByEnd (int end, int[]nums){
        int [] newNums = new int[end];
        for (int i = 0; i < nums.length; i++) {
            if (i < end) {
                newNums[i] = nums[i];
            }
        }

        return newNums;
    }

    private int [] getNumsByStart(int start, int[]nums) {
        int len = nums.length;
        int [] newNums = new int[len -start];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= start) {
                newNums[index++] = nums[i];
            }
        }
        return newNums;
    }
}
