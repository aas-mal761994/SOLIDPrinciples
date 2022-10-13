package com.leet.code.solution;

public class Solution8 {

    /*Input: nums = [1,7,3,6,5,6]
    Output: 3
    Explanation:
    The pivot index is 3.
    Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
    Right sum = nums[4] + nums[5] = 5 + 6 = 11*/

    public int pivotIndex(int[] nums) {
        int pivot = -1, leftSum = 0, rightSum = 0;
        if(nums.length ==1){
            return pivot+1;
        }
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                rightSum += nums[i];
            }
            //pivot elements is at 0th position
            if (leftSum == rightSum) {
                pivot = 0;
                return pivot;
            }
            for (int j = 0; j < nums.length-1; j++) {
                leftSum += nums[j];
                rightSum -= nums[j + 1];
                if (leftSum == rightSum) {
                    pivot = j + 1;
                    return pivot;
                }
            }

        }

        return pivot;
    }

    public static void main(String[] args) {
        Solution8 sol8 = new Solution8();
        int pivotIndex = sol8.pivotIndex(new int[]{1,0});
        System.out.println(pivotIndex);
    }
}
