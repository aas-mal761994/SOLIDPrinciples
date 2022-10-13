package com.leet.code.solution;

import java.util.Arrays;

public class Solution6 {

    public void moveZeroes(int[] nums) {
        int insertPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPosition++] = nums[i];
            }
        }

        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }

    }

    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
        int inputArray[] = new int[]{0, 1, 0, 3, 12};
        s6.moveZeroes(inputArray);
        Arrays.stream(inputArray).forEach(System.out::println);
    }
}
