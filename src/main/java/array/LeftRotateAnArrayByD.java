package array;

public class LeftRotateAnArrayByD {

    //using reversal algorithm
    static void leftRotateByDElement(int ar[], int d) {
        reverse(ar, 0, d - 1);
        reverse(ar, d, ar.length - 1);
        reverse(ar, 0, ar.length - 1);
    }

    private static void reverse(int[] ar, int low, int high) {
        while (low < high) {
            swap(ar, low, high);
            low++;
            high--;
        }
    }

    private static void swap(int[] ar, int low, int high) {
        int temp = ar[low];
        ar[low] = ar[high];
        ar[high] = temp;
    }


    //using left rotate by 1 in loop

    static void leftRotateBy1(int ar[])
    {
        int temp=ar[0];
        for (int i = 0; i < ar.length - 1; i++) {
            ar[i]=ar[i+1];
        }
        ar[ar.length-1]=temp;
    }

    static void leftRotateBydusing1(int ar[],int d)
    {
        for (int i = 0; i < d; i++) {
            leftRotateBy1(ar);
        }
    }


    public static void main(String[] args) {
        int ar[]=new int[]{1,2,3,4,5};
        System.out.println("Left....");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        /*leftRotateByDElement(ar,2);
        System.out.println("\nAfter....");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }*/
        //leftRotateBy1(ar);
        leftRotateBydusing1(ar,2);
        System.out.println("\nAfter....");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
