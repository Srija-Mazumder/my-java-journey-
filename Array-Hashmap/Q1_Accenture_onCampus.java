import java.util.*;
public class Q1_Accenture_onCampus {

    public static int[] find(int nums[], int targetSum) {
        HashMap<Integer, Integer> map = new HashMap<>(); // To store complements
        int maxProd = Integer.MIN_VALUE;
        int[] result = new int[2];
        boolean pairFound = false;

        for (int num : nums) {
            int complement = targetSum - num;

            // Check if complement exists in the map
            if (map.containsKey(num)) {
                int a = num;
                int b = map.get(num);

                // Ensure a > b and maximize product
                if (a > b) {
                    int product = a * b;
                    if (product > maxProd) {
                        maxProd = product;
                        result[0] = a;
                        result[1] = b;
                        pairFound = true;
                    }
                }
            } else {
                // Store the complement
                map.put(complement, num);
            }
        }

        return pairFound ? result : new int[] {}; // Return empty array if no pair found
    }

    public static void main(String[] args) {
        int nums[] = {1, 4, 6, 8, 7, 11, 10};
        int targetSum = 18;

        int[] pair = find(nums, targetSum);

        if (pair.length > 0) {
            System.out.println("The pair is: (" + pair[0] + ", " + pair[1] + ")");
        } else {
            System.out.println("No such pair exists.");
        }
    }
}
---------------------------------------------------------------
//     Complexity Analysis
// Time Complexity:

// Traversing the array takes O(n).
// Each HashMap lookup and insertion is O(1).
// Overall: O(n).
// Space Complexity:

// The HashMap stores up to n elements in the worst case.
// Space complexity: O(n).
