import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("\nEnter your name: ");
        String name = input.nextLine();

        // Print the name entered by the user
        System.out.println("Your name is: " + name);

        input.close();
    }
}
