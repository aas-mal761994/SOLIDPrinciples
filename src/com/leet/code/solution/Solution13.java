package com.leet.code.solution;

import java.math.BigDecimal;

public class Solution13 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution13 s13 = new Solution13();
        String result = s13.addStrings("456", "777");
        System.out.println(result);

        //
        String arr[][] = new String[][]{{"112211", "shivam", "sharma", "9818569506", "1987"},
                {"112210", "shivam", "kumar", "98767565", "1022"},
                {"112235", "Ravi", "Shastri", "1234567890", "1078"}};
        String rep[][] = solve(3, arr, "account_holder_first_name", "shivam");
    }

    static String[][] solve(int N, String[][] A, String D, String V) {


        String columnInfo[] = new String[]{"bank_account_number", "account_holder_first_name", "account_holder_last_name",
                "registered_mobile_number", "branch_code"};
        int columnFilter = 0;
        for (int k = 0; k < columnInfo.length; k++) {
            if (D.equalsIgnoreCase(columnInfo[k])) {
                columnFilter = k;
                break;
            }
        }

        int numberOfRows = 0;
        for (int m = 0; m < N; m++) {
            if (A[m][columnFilter].equalsIgnoreCase(V)) {
                numberOfRows++;
            }
        }

        String result[][] = new String[numberOfRows][5];

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i][columnFilter].equalsIgnoreCase(V) && A[j][columnFilter].equalsIgnoreCase(V)) {
                    if (new BigDecimal(A[i][0]).compareTo(new BigDecimal(A[j][0])) > 0) {
                        //swap the rows
                        String tmpRow[] = A[i];
                        result[i] = A[j];
                        result[j] = tmpRow;
                    }
                }
            }
        }

        return result;
    }
}
