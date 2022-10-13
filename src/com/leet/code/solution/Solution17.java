package com.leet.code.solution;

public class Solution17 {

    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        String plainString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for (int i = 0, j = plainString.length()-1; i < plainString.length() && j > 0; i++, j--) {
            if (plainString.charAt(i) == plainString.charAt(j)) {
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Solution17 s17 = new Solution17();
        String testCase1 = "A man, a plan, a canal: Panama";
        s17.isPalindrome(testCase1);

    }
}
