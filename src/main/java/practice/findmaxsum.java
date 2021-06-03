package practice;

public class findmaxsum {
    // you can also use imports, for example:
// import java.util.*;

    // you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
    public static void main(String[] args) {
        System.out.println(solution(2, "1A 2F 1C"));
    }

    static public int solution(int N, String S) {
        // write your code in Java SE 8
        if(S.isEmpty())
            return 2;
        int count = 0;
        int ar[][] = new int[N][10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0 || j==9) {
                    ar[i][j] = 1;
                }
            }
        }
        String s[] = S.split("\\s+", -1);
        for (int k = 0; k < s.length; k++) {
            int a = s[k].charAt(0) - 49;
            int b = s[k].charAt(1) - 65;
            ar[a][b] = 1;
        }
        int counter;
        for (int i = 0; i < N; i++) {
            counter = 0;
            for (int j = 0; j < 9; j++) {
                if (ar[i][j] == 0) {
                    counter++;
                }
                else
                {
                   counter=0;
                }
                if (counter == 4) {
                    count++;
                }
            }
        }

        return count;
    }
}

