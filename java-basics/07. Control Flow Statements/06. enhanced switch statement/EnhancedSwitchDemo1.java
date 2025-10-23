import java.util.Scanner;

public class EnhancedSwitchDemo1 {
    public static void main(String[] args) {

        // Using try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {

            // Prompt user to enter their grade
            System.out.println("Enter your grade (A | B | C | F): ");
            String grade = input.nextLine().trim().toUpperCase(); // Trim and convert input to uppercase

            // Use an enhanced switch statement
            switch (grade) {
                case "A" -> System.out.println("Excellent! You are a hard-working student, keep it up!");

                case "B" -> System.out.println("Good job, but you can do even better with more effort.");

                case "C" -> System.out.println("You passed, but hard work is needed to improve your grades.");

                case "F" -> System.out.println("Unfortunately, you failed. Don't give up—study harder next time!");

                default -> System.out.println("Invalid input. Please enter a valid grade (A | B | C | F).");
            }

        } // The Scanner is automatically closed here.
    }
}