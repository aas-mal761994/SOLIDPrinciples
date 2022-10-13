package com.leet.code.solution;

public class Solution3 {

    public boolean isPalindrome(int x) {
        boolean result = false;
        //you can reverse the number and can then compare both numbers
        int number = x;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        if (x == reverse) {
            result = true;
        }


        return result;
    }

    public boolean isPalindromeBetter(int x) {

        //convert integer to a string then calculate palindrome
        boolean result = true;
        //you can reverse the number and can then compare both numbers
        String str = String.valueOf(x);
        int length = str.length();
        for(int i=0,j=length-1; i< length/2&& j>=length/2; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                result = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.isPalindromeBetter(12211));
        //System.out.println(s3.isPalindrome(-121));
    }
}
