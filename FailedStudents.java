import java.util.Scanner;

public class FailedStudents {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // input marks
        System.out.println("Enter marks of students:");

        for(int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int failCount = 0;

        // counting failed students
        for(int i = 0; i < n; i++) {
            if(marks[i] < 35) {
                failCount++;
            }
        }

        // output
        System.out.println("Number of failed students: " + failCount);

        sc.close();
    }
}