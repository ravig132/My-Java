import java.util.Scanner;

class Queue {

    // Node class to represent each element in the queue
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Front and rear pointers
    private Node front = null;
    private Node rear = null;

    // Method to insert an element into the queue (enqueue)
    public void enqueue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter value to insert: ");
        int item = sc.nextInt();

        Node newNode = new Node(item);

        if (front == null) {
            // If the queue is empty, both front and rear point to the new node
            front = newNode;
            rear = newNode;
        } else {
            // Otherwise, add the new node at the end and update rear
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("\nValue inserted: " + item);
    }

    // Method to remove an element from the queue (dequeue)
    public void dequeue() {
        if (front == null) {
            System.out.println("\nUnderflow: Queue is empty!");
            return;
        }

        int item = front.data;
        front = front.next;  // Move the front pointer to the next node

        if (front == null) {
            // If the queue becomes empty, rear should also be null
            rear = null;
        }

        System.out.println("\nValue deleted: " + item);
    }

    // Method to display the elements in the queue
    public void display() {
        if (front == null) {
            System.out.println("\nQueue is empty.");
            return;
        }

        System.out.println("\nQueue elements:");
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n************************* Main Menu *****************************");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display the queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queue.enqueue();
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("\nEnter a valid choice!");
            }
        }

        sc.close(); // Close the scanner object
    }
}

