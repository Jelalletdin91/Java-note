import java.util.Scanner;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double totalCost = 0.0;

            while (true) {
                System.out.print("Enter the item ID you want to add to your cart (1-10, or -1 to finish): ");
                int itemId = input.nextInt();

                // Exit the loop if the user enters -1
                if (itemId == -1) {
                    break;
                }

                // Check if the item is out of stock
                if (itemId == 5||itemId<0||itemId>10) {
                    System.out.println("Item ID 5 is out of stock. Please choose a different item.");
                    continue; // Skip this iteration and prompt for another item
                }

                // Simulate the cost of items based on their IDs
                double itemCost = itemId * 10.0; // Example pricing: item ID * 10
                totalCost += itemCost;

                System.out.println("Added item ID " + itemId + " costing $" + itemCost);
            }

            // Display total cost of items in the cart
            System.out.println("Total cost of items in your cart: $" + totalCost);
        } // The Scanner is automatically closed here.
    }
}