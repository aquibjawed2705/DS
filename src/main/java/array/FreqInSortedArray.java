package array;

public class FreqInSortedArray {

    static void findFreq(int ar[]) {
        int count = 1;
        // ar[ar.length]=-1;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i - 1] == ar[i]) {
                count++;
            } else {
                System.out.printf("Count of %d is %d\n", ar[i - 1], count);
                count = 1;
            }
        }
        System.out.printf("Count of %d is %d\n", ar[ar.length - 1], count);
    }

    public static void main(String[] args) {
        int ar[] = new int[]{10,20,30,30,30,40};
        findFreq(ar);
    }
}
