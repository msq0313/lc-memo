package dp.code931;

import java.util.Arrays;

class Solution {

    public int minFallingPathSum(int[][] matrix) {
        // 方形矩阵
        int n = matrix.length;
        int res = Integer.MAX_VALUE;
        // dp[i][j]表示到第i层第j列的最小路径和
        int[][] dp = new int[n][n];
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j - 1 < 0 || j + 1 >= n) {
                    if (j + 1 >= n) {
                        dp[i][j] = matrix[i][j] + Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
                    } else if (j - 1 < 0) {
                        dp[i][j] = matrix[i][j] + Math.min(dp[i - 1][j], dp[i - 1][j + 1]);
                    }
                } else {
                    dp[i][j] = matrix[i][j] + Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i - 1][j + 1]));
                }
            }
        }

        for (int j = 0; j < n; j++) {
            res = Math.min(res, dp[n - 1][j]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };
        System.out.println(new Solution().minFallingPathSum(matrix));
    }
}