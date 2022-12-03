package com.mf.algorithm;

public class RemoveElement27 {
    public static void main(String[] args) {

        RemoveElement27 removeElement27 = new RemoveElement27();
        int result = removeElement27.removeElement(new int[]{3,2,2,3}, 3);
        System.out.println(result);
    }

    /**
     * 不能借助额外的空间
     * 移除 数组 nums中等于val的数，得到最后数组的最终长度 ，可以 转换为移除数组中nums 中不等于val的数的总和
     */

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
