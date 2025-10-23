public class StringsDemo {
    public static void main(String[] args) {

        // Define first and last names
        String firstName = "Bogdan";
        String lastName = "Stashchuk";

        // String concatenation (join first and last name)
        String fullName = firstName + " " + lastName;  // Added space for readability

        // Display full name
        System.out.println("Full Name: " + fullName);  // prints "Bogdan Stashchuk"

        // Print first and last name separately
        System.out.println("First Name: " + firstName);  // prints "Bogdan"
        System.out.println("Last Name: " + lastName);    // prints "Stashchuk"

        // Check the length of the full name
        int nameLength = fullName.length();  // Get the length of fullName
        System.out.println("Length of Full Name: " + nameLength + " characters."); // prints length

        // Convert full name to uppercase
        String fullNameUpperCase = fullName.toUpperCase(); // Convert to uppercase
        System.out.println("Full Name in Uppercase: " + fullNameUpperCase); // prints "BOGDAN STASHCHUK"
        System.out.println(fullName); // Original string remains unchanged

        // Display initials
        char firstInitial = firstName.charAt(0);  // Get the first character of firstName
        char lastInitial = lastName.charAt(0);    // Get the first character of lastName
        System.out.println("Initials: " + firstInitial + "." + lastInitial + "."); // prints "B.S."

    }
}