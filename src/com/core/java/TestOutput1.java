package com.core.java;

import com.leet.code.solution.Solution1;

public class TestOutput1 {
    public static void main(String[] args) {
        foo(null);

        long longWithL = 1000*60*60*24*365L;
        long longWithoutL = 1000*60*60*24*365;
        System.out.println(longWithL);
        System.out.println(longWithoutL);
        System.out.println(Math.sqrt(-4));
        Solution1 solution1 = new Solution1();
    }

    public static void foo(Object o) {
        System.out.println("Object argument");
    }

    public static void foo(String s) {
        System.out.println("String argument");
    }

}
