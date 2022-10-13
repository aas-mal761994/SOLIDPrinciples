package com.leet.code.solution;

import java.util.Arrays;

public class Solution7 {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i-1]+ nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution7 sol7 = new Solution7();
        int result[] =sol7.runningSum(new int[]{1,1,1,1,1});
        Arrays.stream(result).forEach(System.out::println);
    }
}
