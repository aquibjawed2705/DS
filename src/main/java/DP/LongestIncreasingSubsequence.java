package DP;

import java.util.Arrays;


public class LongestIncreasingSubsequence {

    static int[] lis(int ar[]) {
        int tail[] = new int[ar.length];
        tail[0] = ar[0];
        int len = 1;

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > tail[len-1]) {
                tail[len] = ar[i];
                len++;
            } else {
                int index = findIndexOfCeil(ar, ar[i], 0, len-1);
                tail[index] = ar[i];
            }
        }
        return tail;
    }

    private static int findIndexOfCeil(int tail[], int data, int l, int r) {
        while (r > l) {
            int m = l + (r - l) / 2;
            if (tail[m]<=data) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return r;
    }


    static int[] lds(int ar[]) {
        reverse(ar);
        return lis(ar);
    }

    private static void reverse(int[] ar) {
        for (int i = 0,j=ar.length-1; i <(ar.length/2)+1; i++,j--) {
           swap(ar,i,j);
        }
    }

    private static void swap(int[] ar, int i, int j) {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }



    public static void main(String[] args) {
        int ar[]=new int[]{1,11,2,10,4,5,2,1};
        System.out.println("Lis");
        Arrays.stream(lis(ar)).forEach(s->{
            System.out.print(s+" ");
        });
        System.out.println("\nLDS");
        Arrays.stream(lds(ar)).forEach(s->{
            System.out.print(s+" ");
        });

    }
}
