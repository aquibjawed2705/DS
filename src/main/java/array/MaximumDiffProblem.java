package array;

/*Maximum diff is calculated
 as max of a[j]-ar[i]*/

public class MaximumDiffProblem {

    static int maxDiff(int ar[]) {
        int maxdiff = -1;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] - ar[i] > maxdiff) {
                    maxdiff = ar[j] - ar[i];
                }
            }
        }
        return maxdiff;
    }

    static int maxDiffEfficient(int ar[])
    {
        int maxDiff=ar[1]-ar[0];
        int minVal=ar[0];
        for (int j = 1; j < ar.length; j++) {
            maxDiff=Integer.max(maxDiff,ar[j]-minVal);
            minVal=Integer.min(minVal,ar[j]);
        }
        return maxDiff;
    }

    public static void main(String[] args) {
            int ar[]=new int[]{8,2,5,3,2,6};
        System.out.println(maxDiff(ar));
        System.out.println(maxDiffEfficient(ar));
    }
}
