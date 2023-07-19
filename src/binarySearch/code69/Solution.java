package binarySearch.code69;

public class Solution {
    int res = 0;
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int[] nums = new int[x + 1];
        for (int i = 0; i < x + 1; i++) {
            nums[i] = i;
        }
        binarySearch(0, x, nums, x);
        return res;
    }

    // 内存超限
    public void binarySearch(int left, int right, int[] nums, int target) {
        if (left > right) {
            return;
        }
        int mid = left + (right - left) / 2;
        int value = mid * mid;
        if (value == target) {
            res = mid;
        } else if (value < target) {
            res = mid;
            binarySearch(mid + 1, right, nums, target);
        } else if (value > target) {
            binarySearch(left, mid - 1, nums, target);
        }
    }

    // 平方数过大 要用长整形 二分法
    public int mySqrt2(int x) {
        int res = 0;
        long left = 0;
        long right = x;
        while (left <= right) {
            int mid = (int) (left + (right - left) / 2);
            long value = (long) mid * mid;
            if (value == x) {
                return mid;
            } else if (value < x) {
                res = mid;
                left = mid + 1;
            } else if (value > x) {
                right = mid - 1;
            }
        }
        return res;
    }

    // 牛顿迭代法 逐渐逼近 x2 = (x1 + n/x1) / 2
    public int mySqrt3(int x) {
        if (x == 0) {
            return 0;
        }
        int x1 = x / 2 + 1;
        while (true) {
            long value = (long) x1 * x1;
            long value2 = (long) (x1 + 1) * (x1 + 1);
            if (value == x || ((value < x) && value2 > x)) {
                return x1;
            } else {
                x1 = (x1 + x / x1) / 2;
            }
        }
    }

}
