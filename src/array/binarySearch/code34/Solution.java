package array.binarySearch.code34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int resLeft = -1;
        int resRight = -1;
        // search left
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (left < nums.length && nums[left] == target) {
            resLeft = left;
        }
        // search right
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (right >= 0 && nums[right] == target) {
            resRight = right;
        }
        return new int[]{resLeft, resRight};
    }
}
