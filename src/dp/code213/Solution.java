package dp.code213;

public class Solution {
    public int rob2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if (nums.length == 3) {
            return Math.max(nums[0], Math.max(nums[1], nums[2]));
        }
        int[] dp = new int[nums.length - 1];
        dp[0] = 0;
        dp[1] = nums[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[dp.length - 1] + Math.max(nums[0], nums[nums.length - 1]);
    }

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int res = Math.max(
                helper(nums, 0, nums.length - 2),
                helper(nums, 1, nums.length - 1));
        return res;
    }

    public int helper(int[] nums, int a, int b) {
        int[] dp = new int[b - a + 2];
        dp[0] = 0;
        dp[1] = nums[a];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[a + i - 1], dp[i - 1]);
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().rob(new int[]{1, 2 ,3, 1}));
//        System.out.println(new Solution().rob(new int[]{2 ,3, 2}));
        System.out.println(new Solution().rob(new int[]{1 ,2, 1, 0}));
    }
}
