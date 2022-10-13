package com.leet.code.solution;

import java.util.HashMap;
import java.util.Map;

public class Solution9 {

    public int majorityElement(int[] nums) {
        int major = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                major = nums[i];
            } else if (major == nums[i]) {
                count++;
            } else count--;

        }
        return major;
    }

    public static void main(String[] args) {
        Solution9 sol9 = new Solution9();
        System.out.println(sol9.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
