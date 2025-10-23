import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {

        // Using try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter product code: ");

            // Check if the input is an integer
            if (input.hasNextInt()) {
                int productCode = input.nextInt();

                String product = switch (productCode) {
                    case 100 -> {
                        System.out.println("Checking availability for laptop...");
                        boolean isAvailable = true; // Simulated availability check

                        // No need for 'else', we yield based on the condition
                        if (isAvailable) yield "laptop (Available)";
                        yield "laptop (Out of stock)";
                    }
                    case 200 -> {
                        System.out.println("Checking stock for bag...");
                        int stockCount = 0; // Simulated stock count

                        // Directly yield based on stock count
                        if (stockCount > 0) yield "bag (In stock)";
                        yield "bag (Out of stock)";
                    }
                    case 300 -> "basket ball"; // Single statement case
                    case 400 -> "table"; // Single statement case
                    case 500 -> "car"; // Single statement case
                    default -> "product not found"; // Default case
                };

                System.out.println("Product: " + product);
            } else {
                System.out.println("Invalid input. Please enter a valid product code (integer).");
            }
        } // The Scanner is automatically closed here.
    }
}