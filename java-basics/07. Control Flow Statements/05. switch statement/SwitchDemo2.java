import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {

        // Use try-with-resources to automatically close the scanner
        try (Scanner input = new Scanner(System.in)) {

            // Prompt the user for input
            System.out.println("Enter the first three letters of a month (e.g., 'jan', 'feb', 'mar'):");
            String month = input.nextLine().trim().toLowerCase();  // Convert input to lowercase and trim spaces

            // Validate that the input is exactly 3 letters
            if (month.length() != 3) {
                System.out.println("Invalid input. Please enter exactly three letters.");
                return;  // Exit early if input is invalid
            }

            // Use switch statement to determine the number of days in the month
            switch (month) {
                case "jan":
                case "mar":
                case "may":
                case "jul":
                case "aug":
                case "oct":
                case "dec":
                    System.out.println("There are 31 days in the month of: " + month);
                    break;

                case "feb":
                    System.out.println("There are 28 or 29 days in the month of: " + month);
                    break;

                case "apr":
                case "jun":
                case "sep":
                case "nov":
                    System.out.println("There are 30 days in the month of: " + month);
                    break;

                default:
                    System.out.println("Invalid input. Please enter the first three letters of a valid month (e.g., 'jan', 'feb').");
                    break;
            }
        }
    }
}