package com.leet.code.solution;

import java.util.HashMap;
import java.util.Map;

public class Solution20 {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        System.out.println(solution20.isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
    }

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> valueMap = new HashMap<>();
        int wordsInteger[] = new int[words.length];
        for (int i = 0; i < order.length(); i++) {
            valueMap.put(order.charAt(i), i);
        }
        // for each word calculate a number
        for (int i = 0; i < words.length - 1; i++) {
            if (!compare(words[i], words[i + 1], valueMap)) return false;
        }
        return true;
    }

    private boolean compare(String s1, String s2, Map<Character, Integer> map) {
        int l1 = s1.length(), l2 = s2.length();
        for (int i = 0, j = 0; i < l1 && j < l2; i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (map.get(s1.charAt(i)) > map.get(s2.charAt(j))) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        if (l1 > l2) return false;
        return true;
    }
}
