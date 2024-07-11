import java.util.*;

public class Using_constructors {

    private int[] stack;  // Array to store stack elements
    private int top;     // Index of the topmost element (-1 for empty)

    // Constructor: Takes the desired capacity of the stack as input
    public Using_constructors(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int n) {
        if (top < stack.length - 1) {
            top++;
            stack[top] = n;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedElement = stack[top];
            top--;
            return poppedElement;
        } else {
            System.out.println("Stack underflow");
            return -1; // Indicate underflow with a special value
        }
    }

    public int peek() { // Added for completeness
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack is empty");
            return -1; // Indicate underflow with a special value
        }
    }

    public boolean isEmpty() {  // Added for convenience
        return top == -1;
    }

    public boolean isFull() {  // Added for convenience
        return top == stack.length - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the desired stack capacity: ");
        int capacity = sc.nextInt();

        Using_constructors stack = new Using_constructors(capacity); // Create a stack with specified capacity

        System.out.println("Enter operations ('push', 'pop', 'display', 'peek', 'isEmpty', or 'isFull'): ");
        while (true) {
            String operation = sc.nextLine();
            if (operation.equalsIgnoreCase("exit")) {
                break;
            }
            performOperation(stack, operation);
        }
    }

    private static void performOperation(Using_constructors stack, String operation) {
        Scanner sc = new Scanner(System.in);
        switch (operation.toLowerCase()) {
            case "push":
                System.out.println("Enter element to push: ");
                int element = sc.nextInt();
                stack.push(element);
                break;
            case "pop":
                int poppedElement = stack.pop();
                if (poppedElement != -1) { // Check for underflow
                    System.out.println("Popped element: " + poppedElement);
                }
                break;
            case "display":
                stack.display();
                break;
            case "peek":
                int peekElement = stack.peek();
                if (peekElement != -1) { // Check for underflow
                    System.out.println("Top element: " + peekElement);
                }
                break;
            case "isempty":
                System.out.println("Stack is " + (stack.isEmpty() ? "empty" : "not empty"));
                break;
            case "isfull":
                System.out.println("Stack is " + (stack.isFull() ? "full" : "not full"));
                break;
            default:
                System.out.println("Invalid operation. Please enter 'push', 'pop', 'display', 'peek', 'isEmpty', or 'isFull'.");
        }
    }

    private void display() { // Renamed for consistency with other methods
        if (top >= 0) {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
            System.out.println("Stack size = " + (top + 1));
        } else {
            System.out.println("Stack is empty");
        }
    }
}
