package array.code88;

import java.util.Arrays;

public class Solution {
    // code88 合并两个有序数组
    // 因为指定返回nums1，且nums1有足够长度，要从后向前合并
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }
        for (int i = 0; i <= p2; i++) {
            nums1[i] = nums2[i];
        }
    }
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int a = 0;
        int b = 0;
        for (int i = 0; i < m + n; i++) {
            if (a < m && b < n) {
                if (nums1[a] <= nums2[b]) {
                    nums3[i] = nums1[a];
                    a++;
                } else {
                    nums3[i] = nums2[b];
                    b++;
                }
            } else if (a < m) {
                nums3[i] = nums1[a];
                a++;
            } else if (b < n) {
                nums3[i] = nums2[b];
                b++;
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = nums3[i];
        }
    }
}
