import java.util.Scanner;

public class GradeAverageCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double grade;
            double totalGrades = 0;
            int count = 0;

            while (true) {
                System.out.print("Enter a grade (0-100, or -1 to stop): ");
                grade = input.nextDouble();

                // Stop if the user enters -1
                if (grade == -1) {
                    break;
                }

                // Skip invalid grades
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                    continue; // Skip this iteration and ask for a new grade
                }

                totalGrades += grade; // Add valid grade to total
                count++; // Increment the count of valid grades
            }

            // Calculate and display the average
            if (count > 0) {
                double average = totalGrades / count;
                System.out.printf("Total grades entered: %.2f\n", totalGrades);
                System.out.printf("Average grade: %.2f\n", average);
            } else {
                System.out.println("No valid grades were entered.");
            }
        } // The Scanner is automatically closed here.
    }
}