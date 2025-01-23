import java.util.Scanner;

public class FindSumOfbinaryDigits {

    public static int sumOfBinaryDigits(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        }

        int sum = 0;
        while (n > 0) {
            sum += n % 2; // Add the last bit (0 or 1) to the sum
            n = n / 2;     // Integer division effectively right-shifts the bits
        }
        return sum;
    }

    public static String toBinary(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        }

        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2); // Prepend the remainder (0 or 1)
            n = n / 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        try {
            String binaryRepresentation = toBinary(num);
            int digitSum = sumOfBinaryDigits(num);

            System.out.println("Binary representation: " + binaryRepresentation);
            System.out.println("Sum of digits in binary: " + digitSum); // Changed output message
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
