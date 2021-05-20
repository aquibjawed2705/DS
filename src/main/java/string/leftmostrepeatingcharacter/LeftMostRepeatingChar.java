package string.leftmostrepeatingcharacter;

import java.util.Arrays;

public class LeftMostRepeatingChar {

    static int findIndexofLeftMostRepeatingM1(String s) {
        int ar[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            ar[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (ar[s.charAt(i)] > 1) {
                return i;
            }
        }

        return -1;
    }

    static int findIndexofLeftMostRepeatingM2(String s) {
        boolean visited[] = new boolean[256];
        int res = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (visited[s.charAt(i)]) {
                res = i;
            } else {
                visited[s.charAt(i)] = true;
            }
        }
        return res;
    }

    static int findIndexofLeftMostRepeatingM3(String s) {
        int ar[] = new int[256];
        int res = Integer.MAX_VALUE;
        Arrays.fill(ar, -1);
        for (int i = 0; i <s.length(); i++) {
            int index = ar[s.charAt(i)];
            if (index == -1) {
                ar[s.charAt(i)] = i;
            } else {
                res=Math.min(res, index);
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }

    public static void main(String[] args) {
        System.out.println(findIndexofLeftMostRepeatingM1("abaccccbbbb"));
        System.out.println(findIndexofLeftMostRepeatingM2("abaccccbbbb"));
        System.out.println(findIndexofLeftMostRepeatingM3("abc"));
    }
}
