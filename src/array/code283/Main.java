package array.code283;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] nums = new int[]{0, 1, 0, 2, 0};
        int[] nums = new int[]{1, 1, 0, 2, 0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    // 原地将数组中的0移到末尾
    static void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                while (slow < fast) {
                    if (nums[slow] == 0) {
                        nums[slow] = nums[fast];
                        nums[fast] = 0;
                        break;
                    }
                    slow++;
                }
            }
            fast++;
        }
    }
}
