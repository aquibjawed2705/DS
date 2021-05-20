package java8;

import java.util.ArrayList;
import java.util.List;

public class hash {

    static void sum() {
        throw new NullPointerException();
    }

    static int get() {
        try {
            sum();
            return 1;
        } catch (Exception e) {
            //e.printStackTrace();
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        /*HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"abc");
        hashMap.put(1,"bcd");
        hashMap.put(2,"abcd");
        hashMap.put(4,"asasa");

        for (Map.Entry<Integer,String> e:hashMap.entrySet()) {
            System.out.println(e.getKey() + e.getValue());

        }*/

        final List<String> list=new ArrayList<>();

        list.add("abc");

        final String str="abc";

        //str="def";

        System.out.println(list.get(0));


        String s = "abc";
        //String[] str = {"apple", "mango"};
       /* modify(s, str);
        System.out.println(s);
        System.out.println(str[0]+" " +str[1]);*/

    }

    static void modify(String s, String[] str) {
        s = "def";
        str[1] = "guava";
    }
}
