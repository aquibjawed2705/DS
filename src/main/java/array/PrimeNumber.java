package array;

public class PrimeNumber {

    public static void findPrime(int n,int m) {
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        findPrime(2,100);
    }
}
