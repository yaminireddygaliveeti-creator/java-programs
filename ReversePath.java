import java.util.Scanner;

public class ReversePath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of locations in path
        System.out.print("Enter number of locations: ");
        int n = sc.nextInt();

        String[] path = new String[n];

        // input path
        System.out.println("Enter the path locations:");

        for(int i = 0; i < n; i++) {
            path[i] = sc.next();
        }

        // print reverse path
        System.out.println("Reverse Path:");

        for(int i = n - 1; i >= 0; i--) {
            System.out.print(path[i] + " ");
        }

        sc.close();
    }
}
