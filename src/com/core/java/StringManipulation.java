package com.core.java;

public class StringManipulation {
    public static void main(String[] args) {
        String s1 = new String("aastha");
        String s2 = new String("Aastha");
        System.out.println(s1=s2);
        StringManipulation s = new StringManipulation();
       // s.foo(null);

        String str = "abc";
        StringBuffer str2 = new StringBuffer(str);
        System.out.println(str.equals(str2));
    }

    public void foo(String s) {
        System.out.println("String");
    }

    public void foo(StringBuffer sb){
        System.out.println("StringBuffer");
    }
}
