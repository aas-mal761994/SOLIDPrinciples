package com.leet.code.solution;

import java.util.Arrays;

public class Solution5 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for(int i=length-1; i>=0 ;i--){
            if(digits[i]< 9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int newNumber[] = new int[length+1];
        newNumber[0]=1;
        return newNumber;
    }

    public static void main(String[] args) {

        Solution5 sol5 = new Solution5();
        Arrays.stream(sol5.plusOne(new int[]{9,9,9,9})).forEach(System.out::println);

    }
}
