package com.leet.code.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution12 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            if (i <= 2) {
                for (int j = 1; j <= i; j++) {
                    rowList.add(1);
                }
                resultList.add(rowList);
            }

            //Now the case when i>2
            else {
                //first and last element will be 1
                rowList.add(1);
                //fetch previous row from result
                List<Integer> previousRow = resultList.get(i - 2);
                for (int m = 0; m < previousRow.size() - 1; m++) {
                    rowList.add(previousRow.get(m) + previousRow.get(m + 1));
                }
                rowList.add(1);
                resultList.add(rowList);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        Solution12 s12 = new Solution12();
        List<List<Integer>> res = s12.generate(5);
    }
}
