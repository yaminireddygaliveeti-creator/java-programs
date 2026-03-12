import java.util.Scanner;

public class BankingFraudDetection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of transactions
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        double[] transactions = new double[n];

        // input transactions
        System.out.println("Enter transaction amounts:");
        for(int i = 0; i < n; i++) {
            transactions[i] = sc.nextDouble();
        }

        // fraud threshold
        System.out.print("Enter fraud threshold amount: ");
        double threshold = sc.nextDouble();

        System.out.println("Fraudulent Transactions:");

        boolean fraudFound = false;

        for(int i = 0; i < n; i++) {
            if(transactions[i] > threshold) {
                System.out.println("Transaction " + transactions[i] + " flagged as fraud");
                fraudFound = true;
            }
        }

        if(!fraudFound) {
            System.out.println("No fraudulent transactions detected.");
        }

        sc.close();
    }
}