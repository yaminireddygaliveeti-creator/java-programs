import java.util.*;

public class BankTransactionCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        int transactions[] = new int[n];

        System.out.println("Enter transaction amounts: ");
        for(int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }

        // Count total transactions/events
        int count = transactions.length;

        System.out.println("Total number of bank transactions/events: " + count);
    }
}