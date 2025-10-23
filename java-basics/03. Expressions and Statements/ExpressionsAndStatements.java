public class ExpressionsAndStatements {
    public static void main(String[] args) {

        // Example 1: Expressions
        double distance = 150.0;            // distance in kilometers
        double time = 2.5;                  // time in hours
        double speed = distance / time;     // calculates speed in km/h

        System.out.println("Speed: " + speed + " km/h");

        // Example 2: Conditional Expression
        int apples = 7;                    // number of apples
        int oranges = 5;                   // number of oranges
        String fruitMessage = (apples + oranges > 10) ?
                              "You have a lot of fruits!" :
                              "You have a few fruits."; // Conditional expression

        System.out.println(fruitMessage);

        // Example 3: Declaration Statement
        int initialBalance = 500;          // Declaration statement for initial balance
        initialBalance -= 50;              // Withdraws $50 (Expression statement)

        System.out.println("Balance After Withdrawal: $" + initialBalance);

        // Example 4: Conditional Statement
        int score = 0;                     // Declaration statement for score
        score++;                           // Increment score (Expression statement)

        if (score > 0) {                   // Conditional statement
            System.out.println("You have earned a point!");
        } else {
            System.out.println("No points earned.");
        }
    }
}