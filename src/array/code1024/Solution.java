package array.code1024;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int videoStitching(int[][] clips, int time) {
        Arrays.sort(clips, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int compareResult = Integer.compare(o1[0], o2[0]);
                if (compareResult == 0) {
                    return Integer.compare(o1[1] - o1[0], o2[1] - o2[0]);
                }
                return compareResult;
            }
        });
        if (clips[0][0] != 0) {
            return -1;
        }
        int res = 0;
        int curEnd = 0, nextEnd = 0;
        int i = 0, n = clips.length;
        while (i < n && clips[i][0] <= curEnd) {
            while (i < n && clips[i][0] <= curEnd) {
                nextEnd = Math.max(nextEnd, clips[i][1]);
                i++;
            }
            res++;
            if (nextEnd >= time) {
                return res;
            }
            curEnd = nextEnd;
        }
        return -1;
    }

    public static void main(String[] args) {
        /*
        Input: clips = [[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]], time = 10 Output: 3
         */
        int[][] clips = new int[][]{
                {0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}
        };
        int time = 10;
        Assert.assertEquals(new Solution().videoStitching(clips, time), 3);
    }
}
