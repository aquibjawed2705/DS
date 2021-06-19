package array;

public class MaximumSumSubArray {

    static int findHighestSumOfSubArray(int ar[])
    {
        int res=ar[0];
        int maxEnding=ar[0];
        for (int i = 1; i <ar.length; i++) {
            maxEnding=Integer.max(ar[i],maxEnding+ar[i]);
            res=Integer.max(res,maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int ar[]=new int[]{1, -2, 3, -1, 2};
        System.out.println(findHighestSumOfSubArray(ar));
    }
}
