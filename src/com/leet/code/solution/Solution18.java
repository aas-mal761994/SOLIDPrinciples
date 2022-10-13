package com.leet.code.solution;

public class Solution18 {

    public int strStr(String haystack, String needle) {
        int result = -1;
        if (haystack.contains(needle)) {
            result = haystack.indexOf(needle);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution18 s18 = new Solution18();
        System.out.println(s18.strStr("leetcode", "leeto"));
    }
}
