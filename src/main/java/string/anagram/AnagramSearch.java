package string.anagram;

public class AnagramSearch {

    static boolean anagramSearch(String s1,String s2)
    {
        for (int i = 0; i < s1.length(); i++) {
            if(anagram(s1,s2,i))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean anagram(String s1, String s2, int i) {
        int ar[]=new int[256];
       /* for (int j = i; j <s1 .length(); j++) {
            ar[i];
        }*/
        return false;
    }

    public static void main(String[] args) {

    }
}
