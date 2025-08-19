package array;
import java.util.Scanner;
import java.util.Stack;
public class stackop {
	
	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        Scanner scanner = new Scanner(System.in);

	        int choice;
	        do {
	            System.out.println("\n--- Stack Operations Menu ---");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Check if Empty");
	            System.out.println("5. Search");
	            System.out.println("6. Display Stack");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element to push: ");
	                    int element = scanner.nextInt();
	                    stack.push(element);
	                    System.out.println("Pushed: " + element);
	                    break;

	                case 2:
	                    if (!stack.isEmpty()) {
	                        int popped = stack.pop();
	                        System.out.println("Popped: " + popped);
	                    } else {
	                        System.out.println("Stack is empty. Cannot pop.");
	                    }
	                    break;

	                case 3:
	                    if (!stack.isEmpty()) {
	                        int top = stack.peek();
	                        System.out.println("Top element: " + top);
	                    } else {
	                        System.out.println("Stack is empty.");
	                    }
	                    break;

	                case 4:
	                    System.out.println(stack.isEmpty() ? "Stack is empty." : "Stack is not empty.");
	                    break;

	                case 5:
	                    System.out.print("Enter element to search: ");
	                    int search = scanner.nextInt();
	                    int position = stack.search(search);
	                    if (position != -1) {
	                        System.out.println(search + " found at position " + position + " from top.");
	                    } else {
	                        System.out.println(search + " not found in stack.");
	                    }
	                    break;

	                case 6:
	                    System.out.println("Current Stack: " + stack);
	                    break;

	                case 0:
	                    System.out.println("Exiting program...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 0);

	        scanner.close();
	    }
	}
