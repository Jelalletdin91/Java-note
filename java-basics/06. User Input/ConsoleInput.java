import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {

        // Use try-with-resources to ensure the Scanner is closed automatically
        try (Scanner userInput = new Scanner(System.in)) {
            // Read user name as a String
            System.out.print("Enter your name: "); // Prompt for user's name
            String fullName = userInput.nextLine();  // Save user input in "fullName" variable

            // Read user favorite color as a String
            System.out.print("Enter your favorite color: "); // Prompt for user's favorite color
            String favoriteColor = userInput.nextLine(); // Save user input in "favoriteColor" variable

            // Read user favorite number as an int
            System.out.print("Enter your favorite number: "); // Prompt for user's favorite number
            int favoriteNumber = userInput.nextInt(); // Save user input in "favoriteNumber" variable

            // Print name, favorite color, and favorite number
            System.out.println("Name: " + fullName);
            System.out.println("Favorite Color: " + favoriteColor);
            System.out.println("Favorite Number: " + favoriteNumber);
        } // The Scanner will be closed automatically here

    }
}