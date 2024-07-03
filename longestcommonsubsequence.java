import java.util.*;

public class longestcommonsubsequence { 

    public static int lcs(String str_a, String str_b) {
        int m = str_a.length();
        int n = str_b.length();

        if (m == 0 || n == 0) {
            return 0; // Base cases (empty strings have LCS length 0)
        }

        if (str_a.charAt(m - 1) == str_b.charAt(n - 1)) {
            return 1 + lcs(str_a.substring(0, m - 1), str_b.substring(0, n - 1)); 
        } else {
            return Math.max(lcs(str_a, str_b.substring(0, n - 1)),
                           lcs(str_a.substring(0, m - 1), str_b)); 
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
