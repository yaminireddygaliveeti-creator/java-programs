import java.util.*;

public class StreamingOptimization {

    public static void main(String[] args) {

        int[] resolution = {144, 240, 360, 480, 720, 1080};
        int[] bandwidth = {1, 2, 3, 4, 6, 8}; // Mbps required

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available internet bandwidth (Mbps): ");
        int userBandwidth = sc.nextInt();

        int bestResolution = 144;

        for(int i = 0; i < bandwidth.length; i++) {

            if(userBandwidth >= bandwidth[i]) {
                bestResolution = resolution[i];
            }
        }

        System.out.println("Recommended streaming resolution: " + bestResolution + "p");

        sc.close();
    }
}