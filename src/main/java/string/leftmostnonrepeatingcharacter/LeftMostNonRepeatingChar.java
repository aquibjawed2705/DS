package string.leftmostnonrepeatingcharacter;

public class LeftMostNonRepeatingChar {

    static int findIndexofLeftMostRepeatingM1(String s) {
        int ar[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            ar[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (ar[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(findIndexofLeftMostRepeatingM1("eaccccbbbbd"));
    }
}
