package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        majorityElement.majorityElement(new int[]{2,2,1,1,1,2,2});

    }

    public int majorityElement(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > nums.length/2) {
                result = key;
                break;
            }
        }
        return result;
    }
}
