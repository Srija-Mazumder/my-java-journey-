import java.util.*;
public class NextSmallerElement {

    public static int[] findNextSmallerElement(int[] arr) {
        int[] nextSmaller = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        // Iterate from the right side of the array
        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements from the stack while they are greater than the current element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If the stack is empty, the next smaller element is -1
            if (stack.isEmpty()) {
                nextSmaller[i] = -1;
            } else {
                // The next smaller element is the top element of the stack
                nextSmaller[i] = stack.peek();
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return nextSmaller;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 1, 9, 5, 6, 3};
        int[] nextSmaller = findNextSmallerElement(arr);

        System.out.println("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Next Smaller Element: ");
        for (int i : nextSmaller) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
