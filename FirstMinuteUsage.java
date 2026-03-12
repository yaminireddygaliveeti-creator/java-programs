import java.util.Scanner;

public class FirstMinuteUsage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of minutes
        System.out.print("Enter number of minutes: ");
        int n = sc.nextInt();

        double[] usage = new double[n];

        // input MB usage per minute
        System.out.println("Enter data usage per minute (in MB):");
        for(int i = 0; i < n; i++) {
            usage[i] = sc.nextDouble();
        }

        // input limit
        System.out.print("Enter usage limit (MB): ");
        double limit = sc.nextDouble();

        int firstMinute = -1; // -1 means limit not crossed

        for(int i = 0; i < n; i++) {
            if(usage[i] > limit) {
                firstMinute = i + 1; // minute numbering starts from 1
                break;
            }
        }

        if(firstMinute != -1) {
            System.out.println("First minute usage crosses limit: Minute " + firstMinute);
            System.out.println("Usage: " + usage[firstMinute - 1] + " MB");
        } else {
            System.out.println("Usage never crossed the limit.");
        }

        sc.close();
    }
}