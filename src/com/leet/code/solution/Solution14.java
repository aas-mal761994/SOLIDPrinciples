package com.leet.code.solution;

import java.util.Arrays;

public class Solution14 {

    public int removeDuplicatesBetter(int[] nums){
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        return i;
    }

    public int removeDuplicates(int[] nums) {
        int uniqueNumbers = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != Integer.MAX_VALUE && nums[j] != Integer.MAX_VALUE && nums[i] == nums[j]) {
                    nums[j] = Integer.MAX_VALUE;
                }
            }

        }
        Arrays.sort(nums);

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != Integer.MAX_VALUE) {
                uniqueNumbers++;
            }
        }


        return uniqueNumbers;
    }

    public static void main(String[] args) {
        Solution14 s14 = new Solution14();
        int testInput[] = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int uniqueOccurrences = s14.removeDuplicatesBetter(testInput);
        System.out.println(uniqueOccurrences);
    }
}
