package recursion;

public class Permutation {

    public static void main(String[] args) {
        perm("ABC",0);
    }

    static void perm(String s,int j){
        if(s.length()-1==j) {
            System.out.println(s);
            return;
        }
        for (int i = j; i <s.length(); i++) {
            s=swap(s,j,i);
            perm(s,j+1);
            s=swap(s,i,j);
        }
    }

    private static String swap(String str,int i, int j) {
        // or empty then return str
        if (str == null || str.isEmpty())
            return str;

        // Converting the given string
        // into a character array
        char[] ch = str.toCharArray();

        // Traverse the character array
            // Swapping the characters
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

        // Converting the result into a
        // string and return
        return new String(ch);
    }
}
