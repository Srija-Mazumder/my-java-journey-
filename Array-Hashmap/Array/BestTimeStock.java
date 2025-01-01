public class BestTimeStock{
public static int maxProfit(int[] prices) {
        int n = prices.length;
        int r = n - 1; // Start with the last day as the potential sell day
        int maxProfit = 0;

        // Traverse the array from the second last day to the first day
        for (int l = n - 2; l >= 0; l--) {
            if (prices[l] > prices[r]) {
                // Update the maximum selling price day
                r = l;
            } else {
                // Calculate the profit and update maxProfit
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            }
        }

        return maxProfit;
    }

public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(prices1)); // Output: 5
        System.out.println(maxProfit(prices2)); // Output: 0
    }
}
