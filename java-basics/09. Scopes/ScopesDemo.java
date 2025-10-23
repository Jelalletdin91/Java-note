public class ScopesDemo {
    public static void main(String[] args) {
        // This variable is accessible throughout the main method
        int varInMainScope = 1;

        // Check if varInMainScope is greater than 10
        if (varInMainScope > 10) {
            // This variable is only accessible within this if block
            boolean varInIfScope = false;

            // Print values inside the if block
            System.out.println("Inside if block:");
            System.out.println("varInMainScope: " + varInMainScope);
            System.out.println("varInIfScope: " + varInIfScope);
        } else {
            // This variable is only accessible within this else block
            int varInElseScope = 789;

            // Print values inside the else block
            System.out.println("Inside else block:");
            System.out.println("varInMainScope: " + varInMainScope);
            System.out.println("varInElseScope: " + varInElseScope);

            // The following line will lead to error if uncommented
            // System.out.println(varInIfScope); // varInIfScope is not accessible here
        }

        // Print the value of varInMainScope outside of the if/else blocks
        System.out.println("Outside if or else block:");
        System.out.println("varInMainScope: " + varInMainScope);

        // The following lines would lead to errors if uncommented
        // System.out.println(varInIfScope); // varInIfScope is not accessible here
        // System.out.println(varInElseScope); // varInElseScope is not accessible here
    }
}