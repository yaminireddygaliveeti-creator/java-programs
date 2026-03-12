import java.util.Scanner;

public class TotalSales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of sales entries
        System.out.print("Enter number of sales entries: ");
        int n = sc.nextInt();

        int[] sales = new int[n];

        // input sales
        System.out.println("Enter sales for each entry:");

        for(int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        int total = 0;

        // calculate sum of sales
        for(int i = 0; i < n; i++) {
            total += sales[i];
        }

        // output
        System.out.println("Total sales of the day: " + total);

        sc.close();
    }
}
