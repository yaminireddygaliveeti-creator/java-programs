package array;


import java.util.Scanner;

	public class splitname {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get full name input from user
	        System.out.print("Enter full name (first and last): ");
	        String fullName = scanner.nextLine();

	        // Split the name by space
	        String[] nameParts = fullName.split(" ");

	        if (nameParts.length >= 2) {
	            String firstName = nameParts[0];
	            String lastName = nameParts[1];

	            System.out.println("First Name: " + firstName);
	            System.out.println("Last Name: " + lastName);
	        } else {
	            System.out.println("Please enter both first and last name.");
	        }

	        scanner.close();
	    }
	}

