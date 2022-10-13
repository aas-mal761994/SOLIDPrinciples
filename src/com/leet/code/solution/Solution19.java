package com.leet.code.solution;

public class Solution19 {

    public boolean validPalindrome(String s) {
        int count = 0;
        boolean isPalindrome = true;
        for(int i=0, j=s.length()-1;i<s.length()&&j<s.length()/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                count++;
            }
        }
        if(count ==1){
            isPalindrome = true;
        }
        return  isPalindrome;
    }

    public static void main(String[] args) {
        Solution19 s19 = new Solution19();
        s19.validPalindrome("abc");

    }
}
