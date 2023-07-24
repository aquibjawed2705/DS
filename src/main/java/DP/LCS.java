package DP;

public class LCS {

    public static void main(String[] args) {
        // System.out.println(LCSMax("xyzdfgdd","abcd"));//gtab
        //int res = lcs("abcd", "bdcd", 4, 4);
        int res = lcs("abcd", "bdcd");
        System.out.println(res);
    }

    //Time Complexity O(2^n)
    static int lcs(String s1, String s2, int l1, int l2) {
        if (l1 == 0 || l2 == 0) {
            return 0;
        }
        if (s1.charAt(l1 - 1) == s2.charAt(l2 - 1)) {
            return 1 + lcs(s1, s2, l1 - 1, l2 - 1);
        } else {
            return Math.max(lcs(s1, s2, l1 - 1, l2), lcs(s1, s2, l1, l2 - 1));
        }
    }

    //Time Complexity O(mn)
    static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }


    public static int LCSMax(String s1, String s2) {
        int max = 0;
        for (int i = 0; i < s1.length(); i++) {
            int count = LCS(s1, s2, i);
            max = Math.max(max, count);
        }
        return max;
    }

    public static int LCS(String s1, String s2, int start) {
        int count = 0;
        String s = "";
        int k = 0;
        for (int i = start; i < s1.length(); i++) {
            for (int j = k; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    count++;
                    k = j + 1;
                    s = s + s1.charAt(i);
                }
            }
        }
        //System.out.println(count);
        //System.out.println(s);
        return count;
    }
}
