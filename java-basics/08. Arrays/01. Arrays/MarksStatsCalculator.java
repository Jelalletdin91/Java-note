import java.util.Scanner;

public class MarksStatsCalculator {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the name of the subject whose marks you want to enter: ");
            String subject = input.nextLine();

            System.out.print("Enter the number of marks you want to enter: ");
            int totalAmountOfMarks = input.nextInt();

            // Initialize the marks array
            double[] marks = new double[totalAmountOfMarks];

            // Collect marks from the user
            for (int i = 0; i < totalAmountOfMarks; i++) {
                while (true) {
                    System.out.print("Enter marks " + (i + 1) + ": ");
                    double mark = input.nextDouble(); // Insert at ith index
                    if (mark < 0) {
                        System.out.println("Marks cannot be negative. Please enter a valid mark.");
                    } else {
                        marks[i] = mark;
                        break; // Exit the loop if a valid mark is entered
                    }
                }
            }

            // Initialize stats variables
            double maxMarks = marks[0];
            double minMarks = marks[0];
            double totalMarks = 0;

            // Calculate total, max, and min marks
            for (double mark : marks) {
                totalMarks += mark;

                if (mark < minMarks) {
                    minMarks = mark;
                } else if (mark > maxMarks) {
                    maxMarks = mark;
                }
            }

            double average = totalMarks / totalAmountOfMarks;

            // Display the stats
            System.out.println("========================");
            System.out.println("Stats for " + subject);
            System.out.println("========================");
            System.out.println("Average: " + average);
            System.out.println("Maximum Marks: " + maxMarks);
            System.out.println("Minimum Marks: " + minMarks);
        } // The Scanner is automatically closed here.
    }
}