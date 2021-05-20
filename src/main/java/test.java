import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Guava");


        List<Integer> numbers=new ArrayList<>();

        numbers.add(10);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(7);
        numbers.add(12);
        numbers.add(15);




        List<Integer> evenNumbers=numbers.stream().sorted((i1,i2)->-Integer.compare(i1,i2)).collect(Collectors.toList());

       // List<Integer> evenNumbers=numbers.stream().filter(i->i%2==0).collect(Collectors.toList());

        System.out.println(evenNumbers);



        fruits.sort(String::compareTo);

        System.out.println(fruits);
    }
}
