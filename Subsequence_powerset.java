import java.util.*;

class Subsequence_powerset {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string=");
        String string = sc.nextLine();

        System.out.println("string is = " + string);

        findSubsequences(string);
    }

    public static void findSubsequences(String str) {
        int len = str.length();

        // Iterate through all possible combinations (including empty string)
        for (int i = 0; i < (int) Math.pow(2, len); i++) {
            String sub = "";

            // Check if the jth bit is set in the binary representation of i
            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) != 0) {
                    sub += str.charAt(j);
                }
            }

            System.out.println(sub);
        }
    }
}
