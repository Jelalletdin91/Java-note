public class BreakStatementDemo1 {
    public static void main(String[] args) {

        // Loop that iterates from 0 to 9
        for (int i = 0; i < 10; i++) {

            // Break the loop when i equals 5
            if (i == 5) {
                System.out.println("Loop terminated at i = " + i);
                break; // Exits the loop when i is 5
            }

            // Prints the current value of i
            System.out.println("i = " + i);
        }
    }
}