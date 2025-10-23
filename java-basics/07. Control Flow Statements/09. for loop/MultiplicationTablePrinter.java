import java.util.Scanner;

public class MultiplicationTablePrinter {
    public static void main(String[] args) {

        // Using try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number to print its multiplication table: ");
            int number = input.nextInt();

            System.out.println("\nMultiplication Table for " + number + ":");

            // Loop to generate multiplication table from 1 to 10
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}