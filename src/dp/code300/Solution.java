package dp.code300;

import java.util.Scanner;

public class Solution {
    int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = 1;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int maxTemp = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxTemp = Math.max(maxTemp, dp[j]);
                }
            }
            dp[i] = maxTemp + 1;
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    // nums=[10,9,2,5,3,7,101,18]
    // 0,1,0,3,2,3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strs = line.split(",");
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(new Solution().lengthOfLIS(nums));
    }
}
