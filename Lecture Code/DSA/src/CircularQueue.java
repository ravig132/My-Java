import java.util.Scanner;

public class CircularQueue {

    // Defining the maximum size of the queue
    static final int maxSize = 5;
    static int[] queue = new int[maxSize];
    static int front = -1, rear = -1;

    // Method to insert an element into the queue (enqueue)
    public static void enqueue() {
        Scanner sc = new Scanner(System.in);
        if ((rear + 1) % maxSize == front) {
            System.out.println("\nOverflow: The queue is full!");
        } else {
            System.out.print("\nEnter the element: ");
            int item = sc.nextInt();
            if (front == -1) {
                front = 0; // First element inserted
            }
            rear = (rear + 1) % maxSize; // Circular increment
            queue[rear] = item;
            System.out.println("Value inserted: " + item);
        }
    }

    // Method to remove an element from the queue (dequeue)
    public static void dequeue() {
        if (front == -1) {
            System.out.println("\nUnderflow: The queue is empty!");
        } else {
            int item = queue[front];
            if (front == rear) {
                front = -1; // Queue is empty now
                rear = -1;
            } else {
                front = (front + 1) % maxSize; // Circular increment
            }
            System.out.println("Value deleted: " + item);
        }
    }

    // Method to display the current elements of the queue
    public static void display() {
        if (front == -1) {
            System.out.println("\nThe queue is empty!");
        } else {
            System.out.println("\nPrinting values in the queue:");
            int i = front;
            while (i != rear) {
                System.out.println(queue[i]);
                i = (i + 1) % maxSize;
            }
            // Print the last element
            System.out.println(queue[rear]);
        }
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n************************* Main Menu ********************");
            System.out.println("=============================================");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display the queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("\nPlease enter a valid choice.");
            }
        }

        sc.close(); // Close the scanner object
    }
}

