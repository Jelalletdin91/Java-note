import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {

        // Using try-with-resources to ensure the Scanner is closed automatically
        try (Scanner input = new Scanner(System.in)) {

            // Prompt user for grade input
            System.out.print("Enter your grade (A | B | C | F): ");
            String grade = input.nextLine().trim().toUpperCase(); // Normalize input

            // Switch based on the normalized grade input
            switch (grade) {
                case "A":
                    System.out.println("You are a hard working student, keep it up!");
                    break;

                case "B":
                    System.out.println("You can definitely do better if you work hard.");
                    break;

                case "C":
                    System.out.println("You need to work hard to get better grades.");
                    break;

                case "F":
                    System.out.println("Better luck next time.");
                    break;

                default:
                    System.out.println("Invalid input. Valid inputs are: A | B | C | F.");
            }
        }
    }
}