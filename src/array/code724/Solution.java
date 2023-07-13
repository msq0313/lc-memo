package array.code724;

public class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 1; i < nums.length; i++) {
            sumRight += nums[i];
        }
        if (sumLeft == sumRight) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            sumLeft += nums[i];
            sumRight -= nums[i + 1];
            if (sumLeft == sumRight) {
                return i + 1;
            }
        }
        return -1;
    }
}
