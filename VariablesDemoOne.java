public class VariablesDemoOne {
    public static void main(String[] args) {

        // Integral data types
        byte age = 20;                         // Byte: 8-bit signed integer
        short studentCount = 500;              // Short: 16-bit signed integer
        int year = 2051;                       // Int: 32-bit signed integer
        long worldPopulation = 8_000_000_000L; // Long: 64-bit signed integer ("L" for long literal)

        // Declare and assign a value in 2 steps
        int weekDay;    // 1. Declaration
        weekDay = 5;    // 2. Assignment (Friday)

        // Print the values of integral type variables
        System.out.println("age = " + age);
        System.out.println("studentCount = " + studentCount);
        System.out.println("year = " + year);
        System.out.println("worldPopulation = " + worldPopulation);
        System.out.println("weekDay = " + weekDay); // Representing Friday (if Monday is 1)
    }
}