import java.util.*;

public class CloudServerCostOptimization {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of servers: ");
        int n = sc.nextInt();

        int[] cost = new int[n];

        System.out.println("Enter hourly cost of each server:");

        for(int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        Arrays.sort(cost);

        System.out.println("Sorted server costs:");
        for(int c : cost) {
            System.out.print(c + " ");
        }

        int totalCost = 0;

        System.out.print("\nEnter number of servers required: ");
        int k = sc.nextInt();

        for(int i = 0; i < k; i++) {
            totalCost += cost[i];
        }

        System.out.println("Minimum total cost = " + totalCost);

        sc.close();
    }
}