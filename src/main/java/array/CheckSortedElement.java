package array;

public class CheckSortedElement {

    static boolean checkSorted(int ar[])
    {
        int min=ar[0];
        for (int i = 1; i <ar.length; i++) {
            if(ar[i]<min)
             return false;
            min=ar[i];
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkSorted(new int[]{1,1,4,3}));
    }
}
