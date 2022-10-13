package com.leet.code.solution;

import java.util.Arrays;

public class Solution11 {

    public int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int i =0, j=nums.length -1;
        for(int k = nums.length-1; k>=0; k--){
            if(Math.abs(nums[i])> Math.abs(nums[j])){
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution11 s11 = new Solution11();
        Arrays.stream(s11.sortedSquares(new int[]{-4, -1, 0, 3, 10})).forEach(System.out::println);

    }
}
