package mergesort;

public class Exmergesort {

    static void merge(int ar[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = ar[l + i];

        for (int i = 0; i < n2; i++)
            right[i] = ar[n1 + i];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                ar[k++] = left[i++];
            } else {
                ar[k++] = right[j++];
            }
        }

        while (i < n1) {
            ar[k++] = left[i++];
        }
        while (j < n2) {
            ar[k++] = right[j++];
        }
    }

    static void mergeSort(int ar[], int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSort(ar, l, m);
            mergeSort(ar, m + 1, r);
            merge(ar, l, m, r);
        }
    }

    public static void main(String[] args) {
        int ar[] = new int[]{3, 2, 1, 1, 1, 1, 1, 4};
        mergeSort(ar, 0, ar.length-1);

        for (int a : ar) {
            System.out.print(a + " ");
        }

    }
}
