import java.util.Scanner;

public class NetflixWatchStreak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of days
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] watched = new int[n];

        // input watched array
        System.out.println("Enter 1 if watched, 0 if not watched:");
        for(int i = 0; i < n; i++) {
            watched[i] = sc.nextInt();
        }

        int currentStreak = 0;
        int maxStreak = 0;

        // calculate longest streak
        for(int i = 0; i < n; i++) {
            if(watched[i] == 1) {
                currentStreak++;
                if(currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0; // reset streak
            }
        }

        // output
        System.out.println("Longest Netflix watch streak: " + maxStreak + " days");

        sc.close();
    }
}