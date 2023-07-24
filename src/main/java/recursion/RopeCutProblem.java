package recursion;

public class RopeCutProblem {

    public static void main(String[] args) {
        int maxCut = getMaxRopeCut(23, 12, 12, 12, 0);
        System.out.println(maxCut);
    }

    static int x = 0, y = 0, z = 0;

    static int getMaxRopeCut(int n, int a, int b, int c, int count) {
        if (n == 0) {
            return count;
        }

        if (n >= a) {
            x = getMaxRopeCut(n - a, a, b, c, ++count);
            count = 0;
        }
        if (n >= b) {
            y = getMaxRopeCut(n - b, b, c, a, ++count);
            count = 0;
        }
        if (n >= c) {
            z = getMaxRopeCut(n - c, c, a, b, ++count);
            count = 0;
        }

        return Math.max(Math.max(x, y), z);
    }
}
