package binary.code654;

import binary.TreeNode;

import java.util.Arrays;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int bigNum = Integer.MIN_VALUE;
        int bigIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > bigNum) {
                bigNum = nums[i];
                bigIndex = i;
            }
        }
        return new TreeNode(bigNum,
                constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, bigIndex)),
                constructMaximumBinaryTree(Arrays.copyOfRange(nums, bigIndex + 1, nums.length)));
    }
}
