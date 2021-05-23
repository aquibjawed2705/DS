package array;

/**
 * Leader is an number if all the number in right is
 * smaller than that number
 **/
public class LeadersInArray {

    static void leaderInArrays(int ar[])
    {
        int leader=ar[ar.length-1];
        System.out.print(leader+ " ");
        for (int i = ar.length-2; i >0; i--) {
           if(ar[i]>leader)
           {
               System.out.print(ar[i]+" ");
               leader=ar[i];
           }
        }
    }
    public static void main(String[] args) {
        int ar[]=new int[]{1,10,3,4,6,4,2};
        leaderInArrays(ar);
    }
}
