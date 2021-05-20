package quicksort;

public class QuickSort {

    void naivePartition(int arr[], int l, int h, int p) {
        int[] temp = new int[h - l + 1];
        int index = 0;
        for (int i = l; i <= h; i++)
            if (arr[i] <= arr[p]) {
                temp[index++] = arr[i];
            }
        for (int i = l; i <= h; i++)
            if (arr[i] > arr[p]) {
                temp[index++] = arr[i];
            }
        for (int i = l; i <= h; i++)
            arr[i] = temp[i - l];
    }

    static int lomutoPartition(int arr[], int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }

    static int hoarePartition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l - 1;
        int j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i>=j) return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


    static void quickSortUsingHoare(int arr[], int l, int h)
    {
        if(l<h)
        {
            int p=hoarePartition(arr,l,h);
            quickSortUsingHoare(arr,l,p);
            quickSortUsingHoare(arr,p+1,h);
        }
    }

    static void quickSortUsinglomuto(int arr[], int l, int h)
    {
        if(l<h)
        {
            int p=lomutoPartition(arr,l,h);
            quickSortUsinglomuto(arr,l,p-1);
            quickSortUsinglomuto(arr,p+1,h);
        }
    }



   /* static int iPartition(int arr[], int l, int h)
    {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }

    static void qSort(int arr[],int l,int h){
        if(l<h){
            int p=iPartition(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
    }*/


    public static void main(String[] args) {
        int ar[] = new int[]{6,8,9,12,13,5,5};

        int n = ar.length;
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i] + " ");
        System.out.println();
        //quickSort.naivePartition(ar,0,n-1,n-4);
        //quickSortUsinglomuto(ar,0, ar.length-1);
        quickSortUsingHoare(ar,0, ar.length-1);
        //quickSort.qSort(ar,0, ar.length-1);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i] + " ");
    }
}
