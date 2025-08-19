package array;
import java.util.Scanner;
import java.util.*;
public class queueop {
	
	

	
	    public static void main(String[] args) {
	        Queue<Integer> q = new LinkedList<>();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n1.Enqueue  2.Dequeue  3.Display  4.Exit");
	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1:
	                    System.out.print("Enter value: ");
	                    q.add(sc.nextInt());
	                    break;
	                case 2:
	                    if (q.isEmpty())
	                        System.out.println("Queue is empty");
	                    else
	                        System.out.println("Removed: " + q.remove());
	                    break;
	                case 3:
	                    System.out.println("Queue: " + q);
	                    break;
	                case 4:
	                    return;
	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	    }
	}
