public class ArithmeticOperators {
    public static void main(String[] args) {

        // Example 1: Addition operator - total marks in two subjects
        int marksInEnglish = 80;
        int marksInMath = 75;
        int totalMarks = marksInMath + marksInEnglish;

        System.out.println("Total Marks: " + totalMarks); // Output: 155


        // Example 2: Subtraction operator - temperature difference between two days
        double highestTemperature = 45.7;
        double lowestTemperature = -4.5;
        double temperatureDifference = highestTemperature - lowestTemperature;

        System.out.println("Temperature Difference: " + temperatureDifference + " degrees"); // Output: 50.2 degrees


        // Example 3: Multiplication operator - calculating total pizza slices for a group
        int pizzasOrdered = 3;
        int slicesPerPizza = 8;
        int totalPizzaSlices = pizzasOrdered * slicesPerPizza;

        System.out.println("Total Pizza Slices: " + totalPizzaSlices); // Output: 24


        // Example 4: Division operator - calculating average speed
        int totalDistance = 150;  // in kilometers
        int totalHours = 3;       // in hours
        int averageSpeed = totalDistance / totalHours;

        System.out.println("Average Speed: " + averageSpeed + " km/h"); // Output: 50 km/h


        // Example 5: Remainder operator - finding out how many people get extra pizza slice
        int totalGuests = 20;
        int slicesAvailable = 65;
        int slicesLeft = slicesAvailable % totalGuests;

        System.out.println("Slices Left Over: " + slicesLeft); // Output: 5


        // Example 6: Increment operator - weight after a small change
        float weight = 68.5f;
        weight++;  // gained 1 kg
        System.out.println("New Weight: " + weight + " kg"); // Output: 69.5 kg


        // Example 7: Decrement operator - countdown timer for a launch
        long countdownTimer = 10L;
        countdownTimer--;  // time reduced by 1 second
        System.out.println("Countdown Timer: " + countdownTimer + " seconds remaining"); // Output: 9 seconds remaining
    }
}