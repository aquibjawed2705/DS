package string.frequencyofcharacter;

public class Frequency {
    static void freqOfString(String s) {
        int ar[] = new int[26];

        for (int i = 0; i < ar.length; i++) {
            ar[i]=0;
        }

        for (int i = 0; i < s.length(); i++) {
            int a=s.charAt(i)-97;
            ar[a]++;
        }

        for (int i = 0; i < ar.length; i++) {
            if(ar[i]!=0) {
                System.out.printf("Count of %c  is %d", (char) (i + 97), ar[i]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        freqOfString(s);
    }
}
