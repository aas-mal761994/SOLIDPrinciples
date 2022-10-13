package com.leet.code.solution;

public class Solution4 {

    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max_profit = 0;
        while (right < prices.length) {
            int curr_profit = prices[right] - prices[left];
            if (prices[right] > prices[left]) {
                max_profit = Math.max(curr_profit, max_profit);
            } else {
                left = right;
            }
            right = right + 1;
        }

        return max_profit;
    }

    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println((s4.maxProfit(new int[]{7, 1, 5, 3, 6, 4})));

    }
}
