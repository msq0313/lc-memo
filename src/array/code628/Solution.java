package array.code628;

import java.util.Arrays;

public class Solution {
    /**
     * maximum product of three numbers 数组中三个数的最大乘积
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        // 正数>=3 或 全是负数 或 仅有1个负数2个正数
        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        // 存在两个负数
        int b = nums[0] * nums[1] * nums[nums.length - 1];
        return Math.max(a, b);
    }
}
