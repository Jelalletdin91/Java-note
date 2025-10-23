import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        // Prompt for the number of items
        System.out.print("How many items are you purchasing? ");

        if (scanner.hasNextInt()) {
            int numberOfItems = scanner.nextInt();  // Read user's input as an integer
            System.out.println(customerName + ", you want to purchase " + numberOfItems + " items");
        }

        scanner.close();
    }
}