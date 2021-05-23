package array;

import java.util.Arrays;

public class RemoveDuplicate {

    static int[] removeDupliate(int ar[])
    {
        int a[]=new int[ar.length];
        Arrays.fill(a,Integer.MIN_VALUE);
        int nd=a[0]=ar[0];
        for (int i = 1,j=1; i < ar.length; i++) {
            if(ar[i]!=nd) {
                a[j] = ar[i];
                nd=ar[i];
                j++;
            }
        }

        return a;
    }

    static int removeDupliateEfficent(int ar[])
    {
        int j=1;
        for (int i = 1; i < ar.length; i++) {
            if(ar[i]!=ar[i-1]) {
                ar[j] = ar[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int ar[]=new int[]{1,2,2,2,3,4,4,4,5};
        System.out.println("Before....");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
       // ar=removeDupliate(ar);
        int newSize=removeDupliateEfficent(ar);
        System.out.println("\nAfter.....");
        for (int i = 0; i < newSize; i++) {
            if(ar[i]==Integer.MIN_VALUE)
                break;
            System.out.print(ar[i]+" ");
        }
    }
}
