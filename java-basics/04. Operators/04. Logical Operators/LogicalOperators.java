public class LogicalOperators {
    public static void main(String[] args) {

        // Example 1: AND operator - Deciding whether to go for a run
        boolean isWeatherNice = true;  // Is the weather nice?
        boolean isFeelingMotivated = false;  // Is the person feeling motivated?
        boolean shouldGoForRun = isWeatherNice && isFeelingMotivated;

        System.out.println("Should go for a run: " + shouldGoForRun); // Expected output: false

        System.out.println(); // print new line

        // Example 2: OR operator - Checking if it's a good day for a picnic
        boolean isSunny = false;  // Is it sunny?
        boolean isWeekend = true;  // Is it the weekend?
        boolean canGoPicnic = isSunny || isWeekend;

        System.out.println("Can go for a picnic: " + canGoPicnic); // Expected output: true

        System.out.println(); // print new line

        // Example 3: NOT operator - Checking inventory status
        boolean isInventoryEmpty = true;  // Is the inventory empty?
        boolean isInventoryFull = !isInventoryEmpty;  // Inventory is full if not empty
        isInventoryEmpty = !isInventoryEmpty;  // Toggle inventory status

        System.out.println("Is inventory empty: " + isInventoryEmpty); // Expected output: false
        System.out.println("Is inventory full: " + isInventoryFull); // Expected output: false
    }
}