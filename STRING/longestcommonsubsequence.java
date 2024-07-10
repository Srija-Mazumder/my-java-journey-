import java.util.*;

public class longestcommonsubsequence { // Class name should follow CamelCase

    public static int lcs(String str_a, String str_b) { // Function parameters should be Strings
        int m = str_a.length();
        int n = str_b.length();

        if (m == 0 || n == 0) {
            return 0; // Base cases (empty strings have LCS length 0)
        }

        if (str_a.charAt(m - 1) == str_b.charAt(n - 1)) {
            return 1 + lcs(str_a.substring(0, m - 1), str_b.substring(0, n - 1)); // Correct substrings
        } else {
            return Math.max(lcs(str_a, str_b.substring(0, n - 1)), // Exclude last character of Y
                           lcs(str_a.substring(0, m - 1), str_b)); // Exclude last character of X
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string 1 = ");
        String str_a = sc.nextLine();

        System.out.println("enter string 2 = ");
        String str_b = sc.nextLine();

        int lcsLength = lcs(str_a, str_b);
        System.out.println("Length of Longest Common Subsequence: " + lcsLength);
    }
}
