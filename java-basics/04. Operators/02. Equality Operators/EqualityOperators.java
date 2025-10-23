public class EqualityOperators {
    public static void main(String[] args) {

        // Example 1: Comparing the number of apples and oranges in a basket
        int numberOfApples = 12;
        int numberOfOranges = 15;

        // Check if the number of apples is equal to the number of oranges
        boolean areFruitsEqual = numberOfApples == numberOfOranges;
        System.out.println("Are the number of apples equal to the number of oranges? " + areFruitsEqual);

        // Check if the number of apples is not equal to the number of oranges
        boolean isAppleCountDifferent = numberOfApples != numberOfOranges;
        System.out.println("Is the number of apples different from the number of oranges? " + isAppleCountDifferent);

        System.out.println(); // print a new line

        // Example 2: Comparing the temperatures of two different cities
        double temperatureInCityA = 22.5;
        double temperatureInCityB = 22.5;

        // Check if the temperatures in both cities are equal
        boolean areTemperaturesEqual = temperatureInCityA == temperatureInCityB;
        System.out.println("Is the temperature in City A equal to City B? " + areTemperaturesEqual);

        // Change the temperature of City B
        temperatureInCityB = 24.0;

        // Check if the temperatures are now not equal
        boolean areTemperaturesDifferent = temperatureInCityA != temperatureInCityB;
        System.out.println("Is the temperature in City A different from City B? " + areTemperaturesDifferent);
    }
}