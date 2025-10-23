public class WhileLoopDemo {
    public static void main(String[] args) {

        int counter = 1; // Initialize the counter

        while (counter <= 5) {
            System.out.println("Hello World");

            // Update the counter to avoid infinite loop
            counter++;
        }
    }
}