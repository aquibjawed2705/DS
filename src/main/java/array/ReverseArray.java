package array;

public class ReverseArray {

    static void reverseArray(int ar[])
    {
        for (int i = 0,j=ar.length-1; i < (ar.length / 2); i++,j--) {
            swap(ar,i,j);
        }
    }

    private static void swap(int[] ar, int i, int j) {
        /*int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;*/
        ar[i]=ar[i]+ar[j];
        ar[j]=ar[i]-ar[j];
        ar[i]=ar[i]-ar[j];
    }

    public static void main(String[] args) {
        int ar[]=new int[]{1,2,1,4,3};
        System.out.println("Before......");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println("\nAfter.....");
        reverseArray(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
