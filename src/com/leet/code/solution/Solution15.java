package com.leet.code.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution15 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(nums.length ==1){
            resultList.add(new ArrayList<>(nums[0]));
        } else {
            //add every element in the list


            for(int i=0; i<nums.length;i++){
                for(int j= i+1; j<nums.length ;j++){

                }
            }
        }

        return resultList;
    }

    public static void main(String[] args) {

    }
}
