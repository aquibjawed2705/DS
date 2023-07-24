package recursion;

public class PrintInDecreasingOrder {
    public static void main(String[] args) {
     //   printDecreasing(5);
       // printIncreasing(5);
      //  printIncreasingAndDecreasing(5);
       // int n=calculateFactorial(5);
      //  int n=powerLinear(2,5);
        int n=powerLogrithmic(2,5);
        System.out.println(n);
    }

    static void printDecreasing(int n)
    {
        if(n==0) return;
        System.out.println(n);
        printDecreasing(n-1);
    }

    static void printIncreasing(int n)
    {
        if(n==0) return;
        printIncreasing(n-1);
        System.out.println(n);
    }

    static void printIncreasingAndDecreasing(int n)
    {
        if(n==1)
        {
            System.out.println(1);return;
        }
        System.out.println(n);
        printIncreasingAndDecreasing(n-1);
        System.out.println(n);
    }

    static int calculateFactorial(int n)
    {
        if(n==0) return 1;
        return n*calculateFactorial(n-1);
    }

    static int powerLinear(int n,int m)
    {
        if(m==0) return 1;
        return powerLinear(n,m-1)*n;
    }

    static int powerLogrithmic(int n,int m)
    {
        if(m==0) return 1;
        int p=powerLogrithmic(n,m/2)*powerLogrithmic(n,m/2);
       if(m%2!=0)
       {
         return p*n;
       }
       return p;
    }




}

