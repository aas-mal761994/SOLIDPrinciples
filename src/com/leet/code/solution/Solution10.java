package com.leet.code.solution;

public class Solution10 {

    public int fib(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1;

        while (n-- > 1) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        Solution10 s10 = new Solution10();
        System.out.println(s10.fib(5));
        System.out.println(Math.abs(-9));

    }
}
