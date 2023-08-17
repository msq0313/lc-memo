package array.code441;

class Solution {
    // 441 arrangeCoins 排列硬币 二分搜索
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        int mid = 0;
        long sum = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            sum = (long) (1 + mid) * mid / 2;
            if (sum == n) {
                return mid;
            } else if (sum < n) {
                left = mid + 1;
            } else if (sum > n) {
                right = mid - 1;
            }
        }
        return right;
    }

    // 441 arrangeCoins 排列硬币 迭代法
    public int arrangeCoins2(int n) {
        int res = 0;
        for (int i = 1; n >= i; i++) {
            n -= i;
            res++;
        }
        return res;
    }
}