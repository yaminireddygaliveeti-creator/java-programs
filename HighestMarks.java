import java.util.Scanner;

public class HighestMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // taking marks input
        System.out.println("Enter marks of students:");

        for(int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // assume first mark is highest
        int highest = marks[0];

        // finding highest mark
        for(int i = 1; i < n; i++) {
            if(marks[i] > highest) {
                highest = marks[i];
            }
        }

        // output
        System.out.println("Highest marks in the class: " + highest);

        sc.close();
    }
}