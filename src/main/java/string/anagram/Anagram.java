package string.anagram;

import java.util.Arrays;

public class Anagram {

    static boolean findAnagramM1(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char ch[] = s1.toCharArray();
        Arrays.sort(ch);
        s1 = new String(ch);
        char ch1[] = s2.toCharArray();
        Arrays.sort(ch1);
        s2 = new String(ch1);
        return s1.equals(s2);
    }

    static boolean findAnagramM2(String s1, String s2) {
        int ar[] = new int[256];
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            ar[s1.charAt(i)]++;
            ar[s2.charAt(i)]--;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (ar[s1.charAt(i)] != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "aaaaabbbb";
        String s2 = "baaababba";
        System.out.println(findAnagramM1(s1, s2));
        System.out.println(findAnagramM2(s1, s2));
    }
}
