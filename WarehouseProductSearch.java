import java.util.Scanner;

public class WarehouseProductSearch {

    public static int binarySearch(int arr[], int n, int key) {

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted product IDs:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter product ID to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, n, key);

        if (result == -1)
            System.out.println("Product not found in warehouse.");
        else
            System.out.println("Product found at position: " + (result + 1));

        sc.close();
    }
}