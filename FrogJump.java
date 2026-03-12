import java.util.*;

public class FrogJump {

    public static int minEnergy(int[] height) {

        int n = height.length;
        int[] dp = new int[n];

        dp[0] = 0;

        for(int i = 1; i < n; i++) {

            int jump1 = dp[i-1] + Math.abs(height[i] - height[i-1]);

            int jump2 = Integer.MAX_VALUE;

            if(i > 1)
                jump2 = dp[i-2] + Math.abs(height[i] - height[i-2]);

            dp[i] = Math.min(jump1, jump2);
        }

        return dp[n-1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stones: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter heights of stones:");

        for(int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int result = minEnergy(height);

        System.out.println("Minimum energy required = " + result);

        sc.close();
    }
}