package dp.code1143;

import java.util.Scanner;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int res = 0;
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        res = dp[text1.length()][text2.length()];
        return res;
    }
/*
Input: text1 = "abcde", text2 = "ace" Output: 3
 */
    public static void main(String[] args) {
//        String text1 = "abcde";
//        String text2 = "ace";

        String text1 = "bsbininm";
        String text2 = "jmjkbkjkv";
//        Scanner scanner = new Scanner(System.in);
//        text1 = scanner.nextLine();
//        text2 = scanner.nextLine();
        System.out.println(new Solution().longestCommonSubsequence(text1, text2));
    }
}
