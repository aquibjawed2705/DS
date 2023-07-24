package recursion;

public class SubsetSumProblem {

    public static void main(String[] args) {
        int count = subSetSum(4, new int[]{0, 1, 2, 3}, 3, 0, 0);
        System.out.println (count);
    }

    static int subSetSum(int n, int ar[], int sum, int res, int count) {
        if (n == 0) {
            return count;
        }
        count+=subSetSum(n - 1, ar, sum, res, count)+subSetSum(n - 1, ar, sum, res + ar[n - 1], count);
        if (res == sum) count++;
        return count;
    }
}
