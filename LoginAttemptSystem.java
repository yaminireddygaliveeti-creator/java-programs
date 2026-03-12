import java.util.Scanner;

public class LoginAttemptSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {

            System.out.print("Enter Username: ");
            String username = sc.next();

            System.out.print("Enter Password: ");
            String password = sc.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful! Welcome.");
                break;
            } 
            else {
                attempts++;
                System.out.println("Invalid credentials.");

                if (attempts < maxAttempts) {
                    System.out.println("Attempts left: " + (maxAttempts - attempts));
                }
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Account locked due to too many failed attempts.");
        }

        sc.close();
    }
}