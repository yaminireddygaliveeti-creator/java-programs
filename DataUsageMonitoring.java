import java.util.Scanner;

public class DataUsageMonitoring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of days
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        double[] dataUsage = new double[n];

        // input data usage
        System.out.println("Enter data usage for each day (in GB):");
        for(int i = 0; i < n; i++) {
            dataUsage[i] = sc.nextDouble();
        }

        double total = 0;
        double max = dataUsage[0];
        double min = dataUsage[0];
        int maxDay = 0;
        int minDay = 0;

        // traverse array
        for(int i = 0; i < n; i++) {
            total += dataUsage[i];

            if(dataUsage[i] > max) {
                max = dataUsage[i];
                maxDay = i;
            }

            if(dataUsage[i] < min) {
                min = dataUsage[i];
                minDay = i;
            }
        }

        double average = total / n;

        // output
        System.out.println("Total data usage: " + total + " GB");
        System.out.println("Average data usage: " + average + " GB/day");
        System.out.println("Maximum data usage: " + max + " GB on day " + (maxDay + 1));
        System.out.println("Minimum data usage: " + min + " GB on day " + (minDay + 1));

        sc.close();
    }
}
