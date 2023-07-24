package DP;

public class MaximumCut {

    static int maximumCut(int n,int a,int b,int c)
    {
       if(n<=0) return 0;
       return 1+Math.max(Math.max(maximumCut(n-a,a,b,c),maximumCut(n-b,a,b,c)),maximumCut(n-c,a,b,c));
    }

    public static void main(String[] args) {
        System.out.println(maximumCut(30,12,11,13));
    }
}
