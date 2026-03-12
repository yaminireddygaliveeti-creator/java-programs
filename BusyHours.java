import java.util.Scanner;

public class BusyHours {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of hours
        System.out.print("Enter number of hours: ");
        int n = sc.nextInt();

        int[] customers = new int[n];

        // input customers per hour
        System.out.println("Enter number of customers for each hour:");

        for(int i = 0; i < n; i++) {
            customers[i] = sc.nextInt();
        }

        int max = customers[0];
        int busyHour = 0;

        // finding busy hour
        for(int i = 1; i < n; i++) {
            if(customers[i] > max) {
                max = customers[i];
                busyHour = i;
            }
        }

        // output
        System.out.println("Busy hour index: " + busyHour);
        System.out.println("Maximum customers in that hour: " + max);

        sc.close();
    }
}
