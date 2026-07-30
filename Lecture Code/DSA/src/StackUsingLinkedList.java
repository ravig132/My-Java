import java.util.Scanner;

public class StackUsingLinkedList {

    // Node class to represent each element of the stack
    static class Node {
        int val;
        Node next;

        // Constructor to initialize the node with a value
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Stack class that uses a linked list
    static class Stack {
        Node head = null; // Head of the stack (top of the stack)

        // Push method to add an element to the stack
        public void push(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode; // If stack is empty, new node is the head
            } else {
                newNode.next = head; // Point new node to the current head
                head = newNode; // Update head to new node
            }
            System.out.println("Item " + val + " pushed to the stack.");
        }

        // Pop method to remove an element from the stack
        public void pop() {
            if (head == null) {
                System.out.println("Stack underflow! No elements to pop.");
            } else {
                int item = head.val;
                head = head.next; // Move head to the next node
                System.out.println("Item " + item + " popped from the stack.");
            }
        }

        // Display method to print the elements in the stack
        public void display() {
            if (head == null) {
                System.out.println("Stack is empty.");
            } else {
                Node ptr = head;
                System.out.println("Stack elements:");
                while (ptr != null) {
                    System.out.println(ptr.val);
                    ptr = ptr.next;
                }
            }
        }
    }

    // Main method to interact with the user and perform stack operations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(); // Create a stack object
        int choice = 0;

        System.out.println("\n********* Stack operations using linked list *********\n");
        System.out.println("----------------------------------------------");

        // Menu-driven loop for stack operations
        while (choice != 4) {
            System.out.println("\nChose one from the below options...");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Show");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int val = sc.nextInt();
                    stack.push(val); // Call push method
                    break;
                case 2:
                    stack.pop(); // Call pop method
                    break;
                case 3:
                    stack.display(); // Call display method
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }

        sc.close(); // Close the scanner
    }
}

