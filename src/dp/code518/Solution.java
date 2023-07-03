package dp.code518;

public class Solution {
    public int change(int amount, int[] coins) {
        int res = 0;
        int[][] dp = new int[coins.length + 1][amount+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                } else if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        res = dp[coins.length][amount];
        return res;
    }

    // 优化空间复杂度
    public int change2(int amount, int[] coins) {
        int res = 0;
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int i = 1; i < coins.length + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (coins[i - 1] <= j) {
                    dp[j] = dp[j] + dp[j - coins[i - 1]];
                }
            }
        }
        res = dp[amount];
        return res;
    }

    public static void main(String[] args) {
        int amount = 5;
        int[] coins = new int[]{1, 2, 5};
//        int amount = 0;
//        int[] coins = new int[]{1, 2, 5};
        System.out.println(new Solution().change2(amount, coins));
    }
}
