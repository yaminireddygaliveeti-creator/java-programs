import java.util.Scanner;

public class DuplicateRollNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] rollNumbers = new int[n];

        // input roll numbers
        System.out.println("Enter roll numbers of students:");
        for(int i = 0; i < n; i++) {
            rollNumbers[i] = sc.nextInt();
        }

        System.out.println("Duplicate Roll Numbers:");

        boolean foundDuplicate = false;

        // checking duplicates
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(rollNumbers[i] == rollNumbers[j]) {
                    System.out.println(rollNumbers[i]);
                    foundDuplicate = true;
                    break; // avoid printing same duplicate multiple times
                }
            }
        }

        if(!foundDuplicate) {
            System.out.println("No duplicates found.");
        }

        sc.close();
    }
}