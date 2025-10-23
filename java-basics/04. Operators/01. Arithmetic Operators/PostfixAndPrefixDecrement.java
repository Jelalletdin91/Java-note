public class PostfixAndPrefixDecrement {
    public static void main(String[] args) {

        // Example 1: Postfix decrement - inventory tracking
        int inventory = 10; // initial inventory count
        System.out.println("Initial Inventory: " + inventory); // Output: 10

        // A customer purchases an item
        int soldItemsPostfix = inventory--; // decrement after using the current inventory
        System.out.println("Items sold: " + soldItemsPostfix); // Output: 10
        System.out.println("Inventory after sale (postfix): " + inventory); // Output: 9

        System.out.println(); // print a new line


        // Example 2: Prefix decrement - countdown timer
        int countdown = 5; // starting countdown value
        System.out.println("Starting Countdown: " + countdown); // Output: 5

        // Timer decreases before announcing the remaining time
        int timeRemainingPrefix = --countdown; // decrement before using the value
        System.out.println("Time remaining after decrement (prefix): " + timeRemainingPrefix); // Output: 4
        System.out.println("Current Countdown Value: " + countdown); // Output: 4
    }
}