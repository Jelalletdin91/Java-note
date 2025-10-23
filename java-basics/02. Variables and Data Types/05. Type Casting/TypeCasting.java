public class TypeCasting {
    public static void main(String[] args) {

        // Example 1: Implicit casting: int to long (widening conversion, no data loss)
        int numberOfItemsSold = 1500; // Example: 1,500 items sold
        long totalItemsSold = numberOfItemsSold; // int -> long: implicit type casting (no data loss)

        System.out.println("Total items sold (long): " + totalItemsSold); // Output: 1500


        // Example 2: Explicit casting: long to int (narrowing conversion, possible data loss)
        long yearlyRevenue = 2_500_000_000L; // Example: $2.5 billion revenue in cents
        int truncatedRevenue = (int) yearlyRevenue; // long -> int: explicit type casting (possible data loss)

        System.out.println("Yearly revenue (truncated to int): " + truncatedRevenue); // Output: 1474836480


        // Example 3: Implicit casting: char to int (no data loss)
        char currencySymbol = '$'; // Example: currency symbol '$'
        int currencyAscii = currencySymbol; // char -> int: implicit type casting (no data loss)

        System.out.println("Currency symbol '$' in ASCII: " + currencyAscii); // Output: 36


        // Example 4: Explicit casting: int to char (narrowing conversion, possible data loss)
        int examScore = 33*2; // Example: Exam score of 65
        char grade = (char) examScore; // int -> char: explicit type casting (possible data loss)

        System.out.println("Letter grade (based on ASCII conversion): " + grade); // Output: 'A'
    }
}