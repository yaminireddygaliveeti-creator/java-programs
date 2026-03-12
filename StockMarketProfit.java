import java.util.Scanner;

public class StockMarketProfit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of days
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // input stock prices
        System.out.println("Enter stock prices for each day:");
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int minPrice = prices[0];  // assume first day as min price
        int maxProfit = 0;         // no profit initially

        // calculate maximum profit
        for(int i = 1; i < n; i++) {
            if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        // output
        System.out.println("Maximum possible profit: " + maxProfit);

        sc.close();
    }
}
