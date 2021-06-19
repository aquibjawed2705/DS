package queue.generatenowithdigit;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumberWithDigit {

    static void generateNumber(int ar[], int n) {
        Queue<String> queue = new ArrayDeque<>();
        for (Integer i : ar) {
            queue.add(i.toString());
        }
        for (int i = 0; i < n; i++) {
            String x = queue.poll();
            System.out.print(x);
            if (i != n - 1)
                System.out.print(",");
            for (Integer j : ar) {
                queue.add(x + j);
            }
        }
    }

    public static void main(String[] args) {
        int ar[] = new int[]{1, 2, 3};
        generateNumber(ar, 15);
    }
}
