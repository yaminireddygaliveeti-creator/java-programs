import java.util.Scanner;

class QueueArray {

    int front = -1;
    int rear = -1;
    int size;
    int arr[];

    QueueArray(int n) {
        size = n;
        arr = new int[size];
    }

    // Enqueue operation
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(arr[front] + " removed from queue");
            front++;
        }
    }

    // Display queue
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueUsingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int n = sc.nextInt();

        QueueArray q = new QueueArray(n);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();

        sc.close();
    }
}