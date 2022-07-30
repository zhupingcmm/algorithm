package com.mf.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement239 {
    public static void main(String[] args) {
        MajorityElement239 majorityElement239 = new MajorityElement239();
        majorityElement239.majorityElement(new int[]{2,2});
    }
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (map.get(nums[i]) + 1 > nums.length/3 && !result.contains(nums[i])) {
                    result.add(nums[i]);
                } else {
                    map.put(nums[i], map.get(nums[i]) + 1);
                }

            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer key: map.keySet()){
            if (map.get(key) > nums.length/3 && !result.contains(key)) {
                result.add(key);
            }
        }
        return result;
    }
}
