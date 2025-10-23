public class ConditionalOperator {
    public static void main(String[] args) {

        // Example 1: Determining the higher score between two players
        int playerOneScore = 85;
        int playerTwoScore = 92;

        int highestScore = playerOneScore > playerTwoScore ? playerOneScore :playerTwoScore;
        System.out.println("Highest Score: " + highestScore);

        // Example 2: Checking if a student passed or failed an exam
        int studentScore = 72;
        String passFailMessage = studentScore >= 70 ? "Passed" : "Failed";

        System.out.println("Student Result: " + passFailMessage);

        // Example 3: Finding the largest of three temperatures
        double morningTemperature = 18.5;
        double afternoonTemperature = 25.0;
        double eveningTemperature = 20.2;

        double highestTemperature = morningTemperature > afternoonTemperature
                ? (morningTemperature > eveningTemperature ? morningTemperature : eveningTemperature)
                : (afternoonTemperature > eveningTemperature ? afternoonTemperature : eveningTemperature);

        System.out.println("Highest Temperature of the Day: " + highestTemperature);

        // Example 4: Determining whether a person can get a driver's license based on age
        int age = 16;
        String licenseEligibility = age >= 18 ? "Eligible for a driver's license" : "Not eligible for a driver's license";

        System.out.println("License Eligibility: " + licenseEligibility);
    }
}