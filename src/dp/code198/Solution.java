package dp.code198;

public class Solution {
    public int rob(int[] nums) {
        int res = 0;
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        res = dp[nums.length];
        return res;
    }

    // 优化空间复杂度
    public int rob2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int res = 0;
        int dp0 = 0;
        int dp1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = Math.max(dp0 + nums[i], dp1);
            dp0 = dp1;
            dp1 = res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        System.out.println(new Solution().rob2(nums));
    }
}
