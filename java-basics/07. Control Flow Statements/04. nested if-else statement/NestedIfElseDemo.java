import java.util.Scanner;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the Scanner is closed automatically
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How's the weather today? (cold | hot): ");
            String weather = input.nextLine().toLowerCase(); // Convert input to lowercase for consistent comparison

            if (weather.equals("cold")) {
                System.out.print("Would you like to drink 'coffee' or 'hot lemon water'? ");
                String hotDrink = input.nextLine().toLowerCase(); // Convert input to lowercase for consistent comparison

                if (hotDrink.equals("coffee")) {
                    System.out.println("You chose 'coffee'.");
                } else if (hotDrink.equals("hot lemon water")) {
                    System.out.println("You chose 'hot lemon water'.");
                } else {
                    System.out.println("Invalid input. Valid inputs are: 'coffee' | 'hot lemon water'.");
                }
            } else if (weather.equals("hot")) {
                System.out.print("Would you like to drink 'iced tea' or 'lemonade'? ");
                String coldDrink = input.nextLine().toLowerCase(); // Convert input to lowercase for consistent comparison

                if (coldDrink.equals("iced tea")) {
                    System.out.println("You chose 'iced tea'.");
                } else if (coldDrink.equals("lemonade")) {
                    System.out.println("You chose 'lemonade'.");
                } else {
                    System.out.println("Invalid input. Valid inputs are: 'iced tea' | 'lemonade'.");
                }
            } else {
                System.out.println("Invalid input. Valid inputs are: 'cold' | 'hot'.");
            }
        } // The scanner will be closed automatically here
    }
}