package array;

public class ZerosAndOnesProblem {

    static void allZerosLeft(int ar[]) {
        int i=0;
        int j=ar.length-1;
        while (i<j) {
            while (ar[i]!=1 && i<j) {
                i++;
            }
            while (ar[j]!=0 && i<j) {
                j--;
            }
            if(i<j)
            swap(ar,i,j);
        }
    }

    private static void swap(int ar[],int i, int j) {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

    public static void main(String[] args) {
        int ar[]=new int[]{0,0,1,1,0,0};
        allZerosLeft(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] +" ");
        }
    }
}
