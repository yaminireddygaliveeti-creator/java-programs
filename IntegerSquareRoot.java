import java.util.Scanner;

public class IntegerSquareRoot {

    public static int sqrtBinarySearch(int num) {
        int left = 0;
        int right = num;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if (square == num) {
                return mid;
            } 
            else if (square < num) {
                ans = mid;
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sqrtBinarySearch(num);

        System.out.println("Integer square root: " + result);

        sc.close();
    }
}