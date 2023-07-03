package dp.code416;

import java.util.ArrayList;

public class Solution {
    // 转化为01背包问题，重量和价值都为nums元素值，dp[i][w]表示选取下标0-i的数字，背包当前容量为w时能装的最大价值
    public boolean canPartition(int[] nums) {
        int target = 0;
        for (int num : nums) {
            target += num;
        }
        if (target % 2 != 0) {
            return false;
        }
        // 最大容量
        target /= 2;
        int[][] dp = new int[nums.length + 1][target + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j - nums[i - 1] < 0) {
                    dp[i][j] = dp[i - 1][j]; // 不装
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], // 不装
                            dp[i - 1][j - nums[i - 1]] + nums[i - 1]); //装
                }
            }
        }
        return dp[nums.length][target] == target;
    }

    // 优化空间复杂度
    public boolean canPartition3(int[] nums) {
        int target = 0;
        for (int num : nums) {
            target += num;
        }
        if (target % 2 != 0) {
            return false;
        }
        // 最大容量
        target /= 2;
        int[] dp = new int[target + 1];
        for (int j = 0; j < dp.length; j++) {
            dp[j] = 0;
        }
        for (int i = 1; i <= nums.length; i++) {
            for (int j = target; j >= 1; j--) {
                if (j - nums[i - 1] >= 0) {
                    dp[j] = Math.max(dp[j], // 不装
                            dp[j - nums[i - 1]] + nums[i - 1]); //装
                }
            }
        }
        return dp[target] == target;
    }

    boolean res = false;
    public boolean canPartition2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 0;
        for (int num : nums) {
            target += num;
            list.add(num);
        }
        if (target % 2 != 0) {
            return false;
        }
        target /= 2;
        backTrack(0, target, list);

        return res;
    }

    public void backTrack(int sum, int target, ArrayList<Integer> list) {
        if (sum == target) {
            res = true;
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> newList = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                if (j != i) {
                    newList.add(list.get(j));
                }
            }
            backTrack(sum + list.get(i), target, newList);
        }
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 5, 11, 5};
        int[] nums = new int[]{1, 2, 5};
        System.out.println(new Solution().canPartition3(nums));
    }
}
