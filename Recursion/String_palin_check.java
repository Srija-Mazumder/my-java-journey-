import java.util.*;

public class String_palin_check {

    public static boolean check(String str, int i, int n) {
        // Base case: when the middle of the string is reached
        if (i >= n / 2) {
            return true;
        }

        // If characters at the current indices do not match
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }

        // Recursive call to check the next pair of characters
        return check(str, i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // Check if the string is a palindrome
        boolean isPalindrome = check(str, 0, str.length());

        // Print the result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
