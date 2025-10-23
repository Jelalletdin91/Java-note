import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask for the user's name
            System.out.print("Enter your name: ");
            String customerName = scanner.nextLine();

            // Prompt for the number of items
            System.out.print("How many items are you purchasing? ");

            int numberOfItems = scanner.nextInt();  // Read user's input as an integer

            // Check if the customer qualifies for a discount
            // Use if/else to handle input and conditions
            if (numberOfItems >= 10) {
                System.out.println("Great, " + customerName + "! You qualify for a discount!");
            } else {
                int itemsNeededForDiscount = 10 - numberOfItems;
                System.out.println("Hi " + customerName + ", you need to purchase " +
                        itemsNeededForDiscount + " more items to qualify for a discount.");
            }
        } // The scanner will be closed automatically here
    }
}