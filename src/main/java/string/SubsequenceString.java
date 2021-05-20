package string;

import java.util.HashMap;
import java.util.Map;

public class SubsequenceString {

    static Boolean matchSubstring(String s1, String s2) {
        int i = 0, j = 0;

        while (s1.length()>i && s2.length()>j) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else i++;
        }
        return ((s2.length()) == j);

    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "";
         Map map=new HashMap<>();
         map.put("abc",1);

        System.out.println((int)map.get("abc")+2);

       // System.out.println(matchSubstring(s1, s2));
    }
}
