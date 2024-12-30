public class Q3_Volunteer{
    
    // Function to calculate the minimum number of volunteers and the number of days
    public static void volun(int F, int D) {
        // Check for invalid input
        if (F <= 0 || D <= 0) {
            System.out.println("INVALID INPUT");
            return;
        }
        
        // Calculate minimum number of volunteers required
        int minVolunteers = (int) Math.ceil((double) F / D);
        
        // Calculate the number of days needed (same number of days for all volunteers)
        int days = (int) Math.ceil((double) F / (minVolunteers * D));
        
        // Print the results
        System.out.println(minVolunteers + " " + days);
    }
    
    public static void main(String[] args) {
        // Test cases
        volun(120, 10);  // Output: 12 1
        volun(134, 13);  // Output: 11 1
        volun(50, 7);    // Output: 8 1
        volun(200, 0);   // Output: INVALID INPUT
    }
}
