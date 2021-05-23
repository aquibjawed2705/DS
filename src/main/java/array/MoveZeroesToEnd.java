package array;

public class MoveZeroesToEnd {

    static void moveZeroesToEnd(int ar[]) {
        int nonZerosCount = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                swap(ar, i, nonZerosCount);
                nonZerosCount++;
            }

        }
    }

    private static void swap(int[] ar, int i, int nonZerosCount) {
       int temp= ar[i] ;
        ar[i] =  ar[nonZerosCount];
         ar[nonZerosCount]=temp;
    }

    public static void main(String[] args) {
        int ar[] = new int[]{1, 2, 0, 0, 0, 3, 2, 0, 0, 01, 2};
        System.out.println("Before....");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        moveZeroesToEnd(ar);
        System.out.println("\nAfter....");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
