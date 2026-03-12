import java.util.*;

public class AdCampaignOptimization {

    public static int knapsack(int[] cost, int[] profit, int budget) {

        int n = cost.length;
        int[][] dp = new int[n + 1][budget + 1];

        for(int i = 1; i <= n; i++) {

            for(int b = 1; b <= budget; b++) {

                if(cost[i-1] <= b) {

                    dp[i][b] = Math.max(
                        dp[i-1][b],
                        profit[i-1] + dp[i-1][b - cost[i-1]]
                    );

                } else {
                    dp[i][b] = dp[i-1][b];
                }
            }
        }

        return dp[n][budget];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of campaigns: ");
        int n = sc.nextInt();

        int[] cost = new int[n];
        int[] profit = new int[n];

        System.out.println("Enter cost of campaigns:");

        for(int i = 0; i < n; i++)
            cost[i] = sc.nextInt();

        System.out.println("Enter profit of campaigns:");

        for(int i = 0; i < n; i++)
            profit[i] = sc.nextInt();

        System.out.print("Enter total budget: ");
        int budget = sc.nextInt();

        int result = knapsack(cost, profit, budget);

        System.out.println("Maximum profit = " + result);

        sc.close();
    }
}