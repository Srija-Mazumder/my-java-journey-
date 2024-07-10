import java.util.*;

public class String_palin_check2 {

    public static void check(String str, int i, int n, int[] counter) {
        // Base case: when the middle of the string is reached
        if (i >= n / 2) {
            return;
        }

        // If characters at the current indices do not match
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            counter[0]++;
        }

        // Recursive call to check the next pair of characters
        check(str, i + 1, n, counter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // Initialize a counter array
        int[] counter = new int[1];  // Using an array to keep it mutable in recursion
        counter[0] = 0;

        // Check if the string is a palindrome
        check(str, 0, str.length(), counter);

        // Print the result
        if (counter[0] == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
