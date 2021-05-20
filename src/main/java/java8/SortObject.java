package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Human implements Comparable<Human> {
    public String name;
    public Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public static int ageComparator1(Human h1, Human h2) {
        return Integer.compare(h2.age, h1.age);
    }

    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name);
    }


    public int getAge(Human human, Human human1) {
        return Integer.compare(human.age, human1.age);
    }
}


public class SortObject {

    public static void main(String[] args) {

        String abc="baba";

       /* if(Optional.of(abc).isPresent())*/
       /* {*/
       /*     System.out.println("Chal gaya");*/
       /* }*/

        System.out.println(Optional.ofNullable(abc).isPresent()?abc.length():null);


        /*Comparator<Human> ageComparator = (h1, h2) -> Integer.compare(h2.age, h1.age);

        Comparator<Human> nameComparator = (h1, h2) -> {
            if (h1.name == null) return -1;
            else if (h2.name == null) return h1.name == null ? 0 : 1;
            else return h1.name.compareTo(h2.name);
        };

        Comparator<Human> nameAndAgeComparator = (h1, h2) -> {
            if (h1.age != h2.age) {
                return h2.age.compareTo(h1.age);
            } else return h2.name.compareTo(h1.name);
        };

        List<Human> humans = Arrays.asList(new Human("aquib", 26), new Human("madni", 21));
        humans.stream().sorted(nameComparator).collect(Collectors.toList()).forEach(s -> {
            System.out.println(s.age + " " + s.name);
        });

        humans.stream().sorted(Human::ageComparator1).forEach(s -> {
            System.out.println(s.age + " " + s.name);
        });


        Human h = new Human();
        humans.sort(Comparator.nullsFirst(Comparator.comparing(Human::getName)));
        humans.forEach(s -> {
            System.out.println(s);
        });

        humans.stream().sorted(Comparator.comparing(Human::getName).reversed()).forEach(s -> System.out.println(s.name));*/

    }
}
