import java.util.Scanner;

public class ValidAgeInput {
    public static void main(String[] args) {

        // Using try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {

            int age;

            // Loop until a valid age is entered
            do {
                System.out.print("Enter your age (1 - 100): ");

                // Check if the input is an integer
                if (input.hasNextInt()) {
                    age = input.nextInt();

                    // Validate age within the range
                    if (age < 1 || age > 100) {
                        System.out.println("Invalid age input, try again. Valid age range: 1 - 100");
                    }
                } else {
                    // Handle non-integer input
                    System.out.println("Invalid input. Please enter a number between 1 and 100.");
                    input.next(); // Consume the invalid input
                    age = -1; // Set an invalid value to continue the loop
                }

            } while (age < 1 || age > 100); // Continue looping if the age is invalid

            // Check eligibility based on age
            if (age < 18) {
                System.out.println("You are not eligible to drive a car.");
            } else {
                System.out.println("You are eligible to drive a car.");
            }
        } // The Scanner is automatically closed here.
    }
}