package sort.quick;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 4, 7, 4, 8};
        System.out.println(Arrays.toString(nums));
        Solution solution = new Solution();
        solution.shuffle(nums);
        solution.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
