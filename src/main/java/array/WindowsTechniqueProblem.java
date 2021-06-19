package array;

public class WindowsTechniqueProblem {

    //check if sum matches
    static boolean checkGivenSumMatches(int ar[], int matchesSum) {
        int sum = ar[0];
        int start = 0;
        for (int i = 1; i < ar.length; i++) {
            while (sum > matchesSum & start < i - 1) {
                sum -= ar[start];
                start++;
            }
            if (sum == matchesSum) {
                System.out.printf("Found at position between %s to %s ",start,i);
                return true;
            }
                sum += ar[i];
        }
        return sum==matchesSum;
    }

    public static void main(String[] args) {
        int ar[] = new int[]{1, 3, 5, 2, 4};
        System.out.println(checkGivenSumMatches(ar, 1));
    }
}
