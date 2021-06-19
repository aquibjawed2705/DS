package DP;

public class MinimumJumpToReachAtEnd {

    static int findMinJump(int ar[],int n) {
        if (n == 1) return 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 2; i++) {
            if (i + ar[i] >= n - 1) {
                int subres = findMinJump(ar, i + 1);
                if (subres != Integer.MAX_VALUE) {
                    res = Integer.min(res, subres + 1);
                }
            }
        }
        return res;
    }

    static int findMinJumpDp(int ar[],int n) {
       int dp[]=new int[n];
        dp[0]=0;
        for (int i = 1; i < ar.length; i++) {
            dp[i]=Integer.MAX_VALUE;
        }

        for (int i = 1; i < ar.length; i++) {
            for (int j = 0; j < i; j++) {
                if(ar[j]+j>=i) {
                    if (dp[j] != Integer.MAX_VALUE) {
                        dp[i] = Integer.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }
        return dp[n-1];
    }



    public static void main(String[] args) {
        int a=findMinJump(new int[]{3,2,0,0,2,1},6);
        System.out.println(a);
        a=findMinJumpDp(new int[]{3,4,2,1,2,1},6);
        System.out.println(a);
    }
}
