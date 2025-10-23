import java.util.Scanner;

public class BreakStatementDemo2 {
    public static void main(String[] args) {

        // Using try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {
            double numberToAdd;
            double total = 0;

            // Infinite loop until a negative number is entered
            while (true) {
                System.out.print("Enter a positive number (negative number to stop): ");
                numberToAdd = input.nextDouble();

                // Check if the input number is negative
                if (numberToAdd < 0) {
                    System.out.println("Negative number entered. Stopping input.");
                    break; // Exit the loop if a negative number is entered
                }

                // Add the positive number to the total
                total += numberToAdd;
            }
            // Output the total of positive numbers entered
            System.out.printf("Total of positive numbers: %.2f", total);
        } // The Scanner is automatically closed here.
    }
}