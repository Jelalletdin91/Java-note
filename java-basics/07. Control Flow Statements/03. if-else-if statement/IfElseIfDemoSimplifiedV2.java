import java.util.Scanner;

public class IfElseIfDemoSimplifiedV2 {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the Scanner is closed automatically
        try (Scanner input = new Scanner(System.in)) {
            // Prompt user for weather conditions
            System.out.println("Is it raining outside? ");
            boolean isRaining = input.nextBoolean();    // Read user's input as a boolean

            System.out.println("Is it cold outside? ");
            boolean isCold = input.nextBoolean();       // Read user's input as a boolean

            // Check weather conditions and provide appropriate messages
            if (isRaining && isCold) {
                System.out.println("Don't go outside without an umbrella and a jacket.");
            } else if (isRaining) {
                System.out.println("Don't go outside without an umbrella.");
            } else if (isCold) {
                System.out.println("Don't go outside without a jacket.");
            } else {
                System.out.println("You don't need an umbrella or a jacket to go outside.");
            }
        } // The scanner will be closed automatically here
    }
}