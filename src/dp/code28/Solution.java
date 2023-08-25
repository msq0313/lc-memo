package dp.code28;

class Solution {
    // Find the Index of the First Occurrence in a String

    // dp法
    public int strStr(String haystack, String needle) {
        int[][] dp = getDP(needle);
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            int charIndex = haystack.charAt(i);
            j = dp[j][charIndex];
            if (j == needle.length()) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }

    public int[][] getDP(String needle) {
        int[][] dp = new int[needle.length()][256];
        if (needle.isEmpty()) {
            return dp;
        }
        // base case
        int firstCharIndex = needle.charAt(0);
        dp[0][firstCharIndex] = 1;
        int x = 0;
        for (int i = 1; i < needle.length(); i++) {
            int charIndex = needle.charAt(i);
            for (int j = 0; j < 256; j++) {
                dp[i][j] = dp[x][j];
            }
            dp[i][charIndex] = i + 1;
            x = dp[x][charIndex];
        }
        return dp;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "code";
//        int[][] dp = new Solution().getDP("ababc");
//        System.out.println(dp[0][97]);
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[i].length; j++) {
//                if (dp[i][j] != 0) {
//                    System.out.printf("%d -> %d = %d\n", i, j, dp[i][j]);
//                }
//            }
//        }
        System.out.println(new Solution().strStr(haystack, needle));

    }
}