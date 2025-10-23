import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {

        // Use try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {

            // Prompt the user for monthly savings and number of years
            System.out.print("How much($) do you save each month? ");
            double savingPerMonth = input.nextDouble();

            System.out.print("How many years do you want to save for? ");
            int yearsToSaveFor = input.nextInt();

            // Initialize counters
            int yearCounter = 0;
            double savingsSum = 0;

            // Calculate total savings over the years
            while (yearCounter < yearsToSaveFor) {
                savingsSum += savingPerMonth * 12; // Add annual savings
                yearCounter++; // Increment the year counter
            }

            // Display results
            System.out.println("\nSaving per month: $" + savingPerMonth);
            System.out.println("You want to save for " + yearsToSaveFor + " years.");
            System.out.println("After " + yearsToSaveFor + " year(s), you will have saved $" + savingsSum);
        }
    }
}