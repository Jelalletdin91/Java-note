public class OperatorPrecedenceDemo1 {
    public static void main(String[] args) {

        int initialValue = 1;
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 4;
        int fourthNumber = 5;

        // Example 1: Operator precedence - division before addition
        int additionDivisionResult = firstNumber + secondNumber / firstNumber;
        System.out.println("Addition and Division Result: " + additionDivisionResult); // Expected: 3

        // Example 2: Operator precedence - multiplication before subtraction
        int subtractionMultiplicationResult = fourthNumber - firstNumber * firstNumber;
        System.out.println("Subtraction and Multiplication Result: " + subtractionMultiplicationResult); // Expected: 1

        // Example 3: Simple addition and subtraction
        int simpleCalculationResult = initialValue + firstNumber - secondNumber;
        System.out.println("Simple Calculation Result: " + simpleCalculationResult); // Expected: 0

        // Example 4: Postfix increment with division
        int divisionPostfixIncrementResult = fourthNumber++ / firstNumber;
        System.out.println("Division with Postfix Increment Result: " + divisionPostfixIncrementResult); // Expected: 2
        System.out.println("Fourth Number After Increment: " + fourthNumber); // Show the updated value (6)

        // Example 5: Mixed operations with operator precedence
        int complexCalculationResult = thirdNumber / firstNumber * thirdNumber - secondNumber % firstNumber;
        System.out.println("Complex Calculation Result: " + complexCalculationResult); // Expected: 7

        // Example 6: Boolean operations with mixed precedence
        boolean booleanExpressionResult = true == false != !false;
        System.out.println("Boolean Expression Result: " + booleanExpressionResult); // Expected: true
    }
}