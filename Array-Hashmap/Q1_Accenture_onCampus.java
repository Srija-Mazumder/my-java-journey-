import java.util.Arrays;

public class Q1_Accenture_onCampus {

    // Method to find the pair
    public static int[] find(int nums[], int targetSum) {
        int l = nums.length;
        int i = 0, j = l - 1;
        int maxProd = -1;
        int[] result = new int[2];
        boolean pairFound = false;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Two-pointer approach
        while (i < j) {
            int currentSum = nums[i] + nums[j];

            if (currentSum == targetSum) {
                if (nums[j] > nums[i]) { // Condition a > b
                    int product = nums[i] * nums[j];
                    if (product > maxProd) {
                        maxProd = product;
                        result[0] = nums[j]; // a (greater value)
                        result[1] = nums[i]; // b (smaller value)
                        pairFound = true;
                    }
                }
                j--; // Move j to check other possibilities
            } else if (currentSum < targetSum) {
                i++; // Move i to the right
            } else {
                j--; // Move j to the left
            }
        }

        // Step 3: Return the result or indicate no pair found
        if (pairFound) {
            return result;
        } else {
            return null; // No valid pair found
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 4, 6, 8, 7, 11, 10};
        int targetSum = 19;

        int[] pair = find(nums, targetSum);

        if (pair != null) {
            System.out.println("The pair is: (" + pair[0] + ", " + pair[1] + ")");
        } else {
            System.out.println("No such pair exists.");
        }
    }
}
