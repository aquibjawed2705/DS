package recursion;

public class CheckPalindrome {

    public static void main(String[] args) {
        int n=121121;
        String s=checkPalindrome(n,"");
        System.out.println(s.equals(String.valueOf(n)));
    }

    static String checkPalindrome(int n,String s){
        if(n==0){
            return s;
        }
        int rem=n/10;
        int div=n%10;
        s+=div;
        s=checkPalindrome(rem,s);
        return s;
    }
}
