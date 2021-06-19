package DP;

public class LongestSubsequenceProblem {
    static int n,m;

    static int findLongestSubSeq(String s1,String s2,int m,int n)
    {
        if(m==0||n==0) return 0;
        if(s1.charAt(m-1)==s2.charAt(n-1)) {
            return 1 + findLongestSubSeq(s1, s2, m - 1, n - 1);
        }
        else
            return Integer.max(findLongestSubSeq(s1,s2,m-1,n),findLongestSubSeq(s1,s2,m,n-1));
    }
    static int memo[][];
    static int findLongestSubSeqMemo(String s1, String s2, int m, int n)
    {
        if(memo[m][n]!=-1) {
            return memo[m][n];
        }
        if(m==0||n==0) memo[m][n]=0;
        else{
            if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
                memo[m][n]=1 + findLongestSubSeq(s1, s2, m - 1, n - 1);
            } else
                memo[m][n]=Integer.max(findLongestSubSeq(s1, s2, m - 1, n), findLongestSubSeq(s1, s2, m, n - 1));
        }
        return memo[m][n];
    }

    static int findLongestSubSeqTabular(String s1, String s2, int m, int n) {
        int dp[][] =new int[m+1][n+1];

        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < n + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);

            }
        }
        return dp[m][n];
    }


    public static void main(String[] args) {
        String s1="GEEKSFORGEEKS";
        String s2="ABXDEFRTJL";
        m=s1.length();
        n=s1.length();
        memo =new int[m+1][n+1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s1.length(); j++) {
                    memo[i][j] = -1;
            }
        }
        int a=findLongestSubSeq(s1,new StringBuffer(s1).reverse().toString(),s1.length(),s1.length());
        System.out.println();
        System.out.println(a);
        a= findLongestSubSeqMemo(s1,new StringBuffer(s1).reverse().toString(),s1.length(),s1.length());
        System.out.println(a);
        a= findLongestSubSeqTabular(s1,new StringBuffer(s1).reverse().toString(),s1.length(),s1.length());
        System.out.println(a);
    }
}
