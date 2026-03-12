import java.util.Scanner;

public class MinRoomTemperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of temperature readings
        System.out.print("Enter number of temperature readings: ");
        int n = sc.nextInt();

        int[] temp = new int[n];

        // input temperatures
        System.out.println("Enter the room temperatures:");

        for(int i = 0; i < n; i++) {
            temp[i] = sc.nextInt();
        }

        // assume first temperature is minimum
        int min = temp[0];

        // find minimum temperature
        for(int i = 1; i < n; i++) {
            if(temp[i] < min) {
                min = temp[i];
            }
        }

        // output result
        System.out.println("Minimum room temperature: " + min + "°C");

        sc.close();
    }
}