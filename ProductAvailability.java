import java.util.Scanner;

public class ProductAvailability {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] products = new int[n];

        // input product IDs
        System.out.println("Enter product IDs:");

        for(int i = 0; i < n; i++) {
            products[i] = sc.nextInt();
        }

        // product to search
        System.out.print("Enter product ID to check: ");
        int search = sc.nextInt();

        boolean found = false;

        // linear search
        for(int i = 0; i < n; i++) {
            if(products[i] == search) {
                found = true;
                break;
            }
        }

        // result
        if(found) {
            System.out.println("Product is available.");
        } else {
            System.out.println("Product is not available.");
        }

        sc.close();
    }
}
