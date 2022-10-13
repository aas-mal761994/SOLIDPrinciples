package com.leet.code.solution;

public class HackerEarth1 {
    static String solve(int N, char[] ch){
        // Write your code here
        String result = new String(ch);
       /* for(int i=0;i<N; i++){
            new String(ch);
            result.concat(ch[i]);
        }*/

        return result;
    }
    public static void main(String[] args) {
      HackerEarth1 h1 = new HackerEarth1();
        System.out.println(h1.solve(4, new char[]{'n','i','s','h'}));
    }
}
