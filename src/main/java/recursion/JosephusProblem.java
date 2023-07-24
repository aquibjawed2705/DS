package recursion;

import java.util.Arrays;

public class JosephusProblem {

    public static void main(String[] args) {
        int n=jp(5, 1);
        System.out.println(n);
    }

    static int jp(int n, int k) {
        if (n == 1) {
            return 0;
        }
        else {
            return (jp(n - 1, k)+k)%n;
        }
    }
}
