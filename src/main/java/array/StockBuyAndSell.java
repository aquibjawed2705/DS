package array;

public class StockBuyAndSell {

    static int profitInStock(int ar[]) {
        int profit = 0;
        int buy = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i - 1] < ar[i] && ar[i - 1] < buy) {
                buy = ar[i - 1];
            } else if (ar[i - 1] > ar[i]) {
                profit += ar[i - 1] - buy;
                buy = ar[i];
            }
        }
        if (ar[ar.length - 1] > ar[ar.length - 2])
            profit += ar[ar.length - 1] - buy;
        return profit;
    }

    public static void main(String[] args) {
        int ar[] = new int[]{8, 2, 4, 3,10,8,6,5,2};
        System.out.println(profitInStock(ar));
    }
}
