public class AssignmentOperators {
    public static void main(String[] args) {

        // Example 1: Assignment operator - Initializing a count of books
        int totalBooks = 12;
        System.out.println("Total books in the library: " + totalBooks);

        // Example 2: Add and assign operator - Adding new books to the library
        int newBooks = 5;
        int currentTotalBooks = 12;
        currentTotalBooks += newBooks; // shorthand for currentTotalBooks = currentTotalBooks + newBooks;
        System.out.println("Total books after adding new arrivals: " + currentTotalBooks);

        // Example 3: Subtract and assign operator - Removing borrowed books
        int booksInLibrary = 10;
        int booksBorrowed = 3;
        booksInLibrary -= booksBorrowed; // shorthand for booksInLibrary = booksInLibrary - booksBorrowed;
        System.out.println("Total books after removing borrowed books: " + booksInLibrary);

        // Example 4: Multiply and assign operator - Increase production output per hour when a factory doubles efficiency
        int outputPerHour = 100;
        int efficiencyMultiplier = 2;
        outputPerHour *= efficiencyMultiplier; // Output doubles
        System.out.println("New production output per hour: " + outputPerHour + " units");

        // Example 5: Divide and assign operator - Reduce daily calorie intake after starting a diet
        int dailyCalories = 2500;
        int dietFactor = 2;
        dailyCalories /= dietFactor; // Cut daily calories in half
        System.out.println("New daily calorie intake: " + dailyCalories + " kcal");

        // Example 6: Remainder and assign operator - Find remaining minutes after dividing work hours into full shifts
        int totalMinutes = 250;
        int shiftLengthMinutes = 60;
        totalMinutes %= shiftLengthMinutes; // Remaining minutes after full shifts
        System.out.println("Remaining minutes after full shifts: " + totalMinutes);
    }
}