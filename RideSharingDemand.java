import java.util.Scanner;

public class RideSharingDemand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of hours
        System.out.print("Enter number of hours: ");
        int n = sc.nextInt();

        int[] rides = new int[n];

        // input ride requests
        System.out.println("Enter ride requests per hour:");
        for(int i = 0; i < n; i++) {
            rides[i] = sc.nextInt();
        }

        int max = rides[0];
        int hour = 0;

        // find maximum demand
        for(int i = 1; i < n; i++) {
            if(rides[i] > max) {
                max = rides[i];
                hour = i;
            }
        }

        // output result
        System.out.println("Hour with maximum demand: Hour " + (hour + 1));
        System.out.println("Ride requests: " + max);

        sc.close();
    }
}