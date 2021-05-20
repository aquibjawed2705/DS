package mergesort;

public class MergeSort {

    void merge(int ar[], int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++)
            left[i] = ar[l + i];
        for (int i = 0; i < n2; i++)
            right[i] = ar[n1 + i];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                ar[k] = left[i];
                i++;
                k++;
            } else {
                ar[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            ar[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            ar[k] = right[j];
            j++;
            k++;
        }
    }

    void mergeSort(int ar[], int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSort(ar, l, m);
            mergeSort(ar, m + 1, r);
            merge(ar, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] ar = new int[]{3, 2, 6, 7, 3,5};
        for (int i = 0; i < ar.length; i++)
            System.out.print(ar[i] + " ");

        System.out.println();

        new MergeSort().mergeSort(ar, 0, ar.length-1);
        for (int i = 0; i < ar.length; i++)
            System.out.print(ar[i] + " ");
    }

}
