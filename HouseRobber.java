import java.util.*;

public class HouseRobber {

    public static int rob(int[] nums) {

        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int prev1 = 0;
        int prev2 = 0;

        for(int money : nums) {

            int temp = prev1;

            prev1 = Math.max(prev2 + money, prev1);

            prev2 = temp;
        }

        return prev1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();

        int[] houses = new int[n];

        System.out.println("Enter money in each house:");

        for(int i = 0; i < n; i++) {
            houses[i] = sc.nextInt();
        }

        int result = rob(houses);

        System.out.println("Maximum money robbed = " + result);

        sc.close();
    }
}