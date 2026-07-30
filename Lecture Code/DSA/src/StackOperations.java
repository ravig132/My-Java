import java.util.Scanner;

public class StackOperations {

    static int[] stack = new int[100];
    static int top = -1;
    static int n;

    // Push operation
    public static void push() {
        Scanner sc = new Scanner(System.in);
        if (top == n - 1) {
            System.out.println("\nOverflow: Stack is full");
        } else {
            System.out.print("Enter the value to push: ");
            int val = sc.nextInt();
            top = top + 1;
            stack[top] = val;
            System.out.println(val + " pushed onto stack");
        }
    }

    // Pop operation
    public static void pop() {
        if (top == -1) {
            System.out.println("Underflow: Stack is empty");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top = top - 1;
        }
    }

    // Show operation
    public static void show() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack contents:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting the number of elements for the stack
        System.out.print("Enter the number of elements in the stack: ");
        n = sc.nextInt();

        System.out.println("*********Stack operations using array*********");
        System.out.println("----------------------------------------------");

        int choice = 0;

        // Menu-driven loop
        while (choice != 4) {
            System.out.println("Choose one from the below options...");
            System.out.println("\n1. Push\n2. Pop\n3. Show\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
}

