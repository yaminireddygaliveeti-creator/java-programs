import java.util.Scanner;

public class CustomerPurchasePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter profit/loss for each day:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        for(int i = 1; i < n; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);

        }

        System.out.println("Maximum purchase profit period: " + maxSum);

        sc.close();
    }
}