import java.util.Scanner;

public class EnhancedSwitchDemo2 {
    public static void main(String[] args) {

        // Using try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter the first three letters of a month to know how many days are in that month: ");
            String month = input.nextLine().trim().toLowerCase(); // Trim and convert to lowercase for uniformity

            switch (month) {
                // Cases for months with 31 days
                case "jan", "mar", "may", "jul", "aug", "oct", "dec" -> {
                    System.out.println("There are 31 days in the month of: " + month);
                    // more actions
                }

                // Case for February
                case "feb" -> {
                    System.out.println("There are 28 or 29 days in the month of: " + month);
                }

                // Cases for months with 30 days
                case "apr", "jun", "sep", "nov" -> {
                    System.out.println("There are 30 days in the month of: " + month);
                }

                // Default case for invalid inputs
                default->  {
                    System.out.println("Invalid input. Please enter the first three letters of a valid month name.");
                }
            }
        } // The Scanner is automatically closed here.
    }
}