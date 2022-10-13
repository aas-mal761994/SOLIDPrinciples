package com.leet.code.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int result[]= new int[2];
        for(int i=0; i< length; i++){
            for (int j= i+1; j<length; j++){
                if(nums[i]+ nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                } else {
                    continue;
                }
            }
        }

        return result;
    }
    public int[] twoSumBetterSolution(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }



    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        int numArray[] = s2.twoSum(new int[]{3,2,4}, 6);
        int numArrayBetter [] = s2.twoSumBetterSolution(new int[]{3,2,4}, 6);
        Arrays.stream(numArray).forEach(System.out::println);
        Arrays.stream(numArrayBetter).forEach(System.out::println);
    }
}
