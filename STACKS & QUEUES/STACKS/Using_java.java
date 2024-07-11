import java.util.*;

public class Using_java {

    static int top = -1;
    static int stack[] = new int[15];

    static void push(int n) {
        if (top < stack.length - 1) {
            top++;
            stack[top] = n;
        } else {
            System.out.println("Stack overflow");
        }
    }

    static void pop() {
        if (top >= 0) {
            top--;
        } else {
            System.out.println("Stack underflow");
        }
    }

    static void dis() {
        if (top >= 0) {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
            System.out.println("Stack size = " + (top + 1));
        } else {
            System.out.println("Stack is empty");
        }
    }

    static void performOperation(String operation) {
        switch (operation.toLowerCase()) { // Use toLowerCase() for case-insensitive matching
            case "push":
                System.out.println("Enter element to push: ");
                Scanner sc = new Scanner(System.in);
                int element = sc.nextInt();
                push(element);
                break;
            case "pop":
                pop();
                break;
            case "dis":
                dis();
                break;
            default:
                System.out.println("Invalid operation. Please enter 'push', 'pop', or 'dis'.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of operations you want to perform: ");
        int no = sc.nextInt();

        for (int i = 0; i < no; i++) {
            System.out.println("Enter operation ('push', 'pop', or 'dis'): ");
            String name = sc.nextLine();
            performOperation(name); // Call the separate function for clarity
        }
    }
}
