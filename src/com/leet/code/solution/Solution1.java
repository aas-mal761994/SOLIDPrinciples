package com.leet.code.solution;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int romanToInt(String s) {
        int result = 0;
        int length = s.length();
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        if (length == 1) {
            return romanMap.get(s.charAt(0));
        }

        for (int i = 0, j = i + 1; i < length && j < length; i++, j++) {

            Character left = s.charAt(i);
            Character right = s.charAt(j);
            Integer leftValue = romanMap.get(left);
            Integer rightValue = romanMap.get(right);
            if (leftValue >= rightValue) {
                result = result + leftValue;
            }

            if (j == length - 1 && leftValue >= rightValue) {
                result = result + romanMap.get(s.charAt(j));
            }

            if (leftValue < rightValue) {
                Integer temp = rightValue - leftValue;
                result = result + temp;
                i++;
                j++;
                if (j == length - 1 && romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(j))) {
                    result = result + romanMap.get(s.charAt(j));
                }
            }
        }
        return result;
    }

    public int romanToIntBetter(String s) {
        int nums[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'M':
                    nums[i]=1000;
                    break;
                case 'D':
                    nums[i]=500;
                    break;
                case 'C':
                    nums[i]=100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X' :
                    nums[i]=10;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
                sum-=nums[i];
            else
                sum+=nums[i];
        }
        return sum+nums[nums.length-1];
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.romanToInt("LVIII")); // 1000+500+100+90+5
        System.out.println(sol.romanToIntBetter("LVIII"));
    }

}
