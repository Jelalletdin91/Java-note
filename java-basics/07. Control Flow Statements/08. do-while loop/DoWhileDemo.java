public class DoWhileDemo {
    public static void main(String[] args) {

        int counter = 1;

        // Execute the loop at least once, then check the condition
        do {
            System.out.println("Hello World");
            counter++; // Increment counter after printing
        } while (counter <= 5); // Continue looping as long as the counter is less than or equal to 5
    }
}