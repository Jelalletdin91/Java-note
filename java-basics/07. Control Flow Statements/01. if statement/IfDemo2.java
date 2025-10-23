import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        // Prompt for the number of items
        System.out.print("How many items are you purchasing? ");

        int numberOfItems = scanner.nextInt();  // Read user's input as an integer

        // Check if the customer qualifies for a discount
        if (numberOfItems >= 10) {
            System.out.println("Great, " + customerName + "! You qualify for a discount!");
        }

        if (numberOfItems < 10) {
            int itemsNeededForDiscount = 10 - numberOfItems;
            System.out.println("Hi " + customerName + ", you need to purchase " +
                    itemsNeededForDiscount + " more items to qualify for a discount.");
        }

        scanner.close();
    }
}