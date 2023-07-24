package java8;

class A{
    public static void a()
    {
        System.out.println("Class A Method a");
    }
}

class B extends A{
    public static void a()
    {
        System.out.println("Class B Method a");
    }
}

public class MethodHiding {
    public static void main(String[] args) {

        A b=new B();
        b.a();
        B.a();
    }
}
