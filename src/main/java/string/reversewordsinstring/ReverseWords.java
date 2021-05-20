package string.reversewordsinstring;

import java.util.Stack;

public class ReverseWords {
    static String reverseM1(String s) {
        String str[]=s.split("\\s+");
        StringBuilder stringBuilder=new StringBuilder();
        for (int i =str.length-1;i>=0; i--) {
            stringBuilder.append(str[i]);
            if(i!=0)
                stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    static String reverseM2(String s) {
        String str[]=s.split("\\s+");
        Stack<String> stack=new Stack<>();
        for (int i = 0; i < str.length; i++) {
         stack.push(str[i]);
        }

        StringBuilder stringBuilder=new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            stringBuilder.append(stack.pop()+" ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s="I i am aquib";
        System.out.println(reverseM1(s));
        System.out.println(reverseM2(s));
    }
}
