import java.util.Scanner;

public class AdsClickAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of days/campaigns
        System.out.print("Enter number of days/campaigns: ");
        int n = sc.nextInt();

        int[] clicks = new int[n];

        // input clicks
        System.out.println("Enter number of clicks for each day/campaign:");
        for(int i = 0; i < n; i++) {
            clicks[i] = sc.nextInt();
        }

        int totalClicks = 0;

        // calculate total clicks
        for(int i = 0; i < n; i++) {
            totalClicks += clicks[i];
        }

        // output
        System.out.println("Total clicks: " + totalClicks);

        sc.close();
    }
}
