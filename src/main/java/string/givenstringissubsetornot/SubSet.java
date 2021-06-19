package string.givenstringissubsetornot;

public class SubSet {

    static boolean checkSubsetPresent(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j<s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return j == s2.length();
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "ekse";
        System.out.println(checkSubsetPresent(s1, s2));
    }
}
