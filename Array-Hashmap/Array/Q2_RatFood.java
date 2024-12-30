public class Q2_RatFood {
    public static int food(int r, int arr[], int unit) {
        int n = arr.length;
        int sum = 0, num = -1; // Default to -1 for empty array
        int requiredFood = r * unit; // Calculate total required food

        if (n == 0) return -1; // If array is empty, return -1

        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Add current house's food

            if (sum >= requiredFood) { // Check if the requirement is met
                num = i + 1; // Found the minimum number of houses (1-based index)
                break;
            }
        }

        // If total food is insufficient, return 0
        if (sum < requiredFood) {
            return 0;
        }

        return num; // Return the index of the last house
    }

    public static void main(String args[]) {
        int[] test1 = {2, 8, 3, 5, 7, 4, 1, 2};
        int[] test2 = {1, 1, 1, 1, 1};
        int[] test3 = {};
        int[] test4 = {5, 5, 5, 5, 5};

        System.out.println(food(7, test1, 2)); // Output: 4
        System.out.println(food(7, test2, 2)); // Output: 0
        System.out.println(food(7, test3, 2)); // Output: -1
        System.out.println(food(3, test4, 3)); // Output: 3
    }
}
