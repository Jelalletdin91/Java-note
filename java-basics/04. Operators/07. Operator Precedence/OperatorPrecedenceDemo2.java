public class OperatorPrecedenceDemo2 {
    public static void main(String[] args) {

        int baseValue = 1;
        int firstValue = 2;
        int secondValue = 3;
        int thirdValue = 4;
        int fourthValue = 5;

        // Changing the order of calculations using parentheses "( )"

        // Example 1: Addition is performed first, then the result is divided by firstValue
        int additionDivisionResult = (firstValue + secondValue) / firstValue;
        System.out.println("Addition Division Result: " + additionDivisionResult); // Expected: 2

        // Example 2: Subtraction is performed first, then the result is multiplied by firstValue
        int subtractionMultiplicationResult = (fourthValue - firstValue) * firstValue;
        System.out.println("Subtraction Multiplication Result: " + subtractionMultiplicationResult); // Expected: 6

        // Example 3: Complex expression where parentheses dictate the order of operations
        // The innermost parentheses are evaluated first, followed by the remainder operation
        int complexCalculationResult = thirdValue / ((firstValue * (thirdValue - baseValue)) % thirdValue);
        System.out.println("Complex Calculation Result: " + complexCalculationResult); // Expected: 2
    }
}