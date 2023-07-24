package DP;

public class CoinChangedCount {

    public static void main(String[] args) {
        int a = coinChoiceCount(new int[]{1, 3}, 4, 2);
        System.out.println(a);
       /* a = coinChoiceCountTabular(new int[]{1, 3}, 4, 2);
        System.out.println(a);*/
    }

    static int coinChoiceCount(int coins[], int sum, int n) {
        if (n == 0) return 0;
        if (sum == 0) return 1 + coinChoiceCount(coins, sum, n - 1);
        else if (coins[n - 1] <= sum) {
            return Math.max(coinChoiceCount(coins, sum - coins[n - 1], n),coinChoiceCount(coins, sum, n-1));
        }
        else return -1;
    }


    static int coinChoiceCountTabular(int coins[], int sum, int n) {
        int dp[][] = new int[sum + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < sum + 1; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i < sum + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                dp[i][j] = dp[i][j - 1];
                if (coins[j - 1] <= i)
                    dp[i][j] += dp[i - coins[j - 1]][j];
            }
        }
        return dp[sum][n];

    }

  /*  static int coinChoiceCount(int coins[],int sum,int n)
    {
        if(sum==0) return 1;
        if(n==0) return 0;

        int res=coinChoiceCount(coins,sum,n-1);
        if(coins[n-1]<=sum)
        {
            res+=coinChoiceCount(coins,sum-coins[n-1],n);
        }
       return res;
    }*/


}
