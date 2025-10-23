public class RelationalOperatorsDemo1 {
    public static void main(String[] args) {

        // Example 1: Comparing ages
        int ageOfChris = 25;
        int ageOfJordan = 30;
        boolean isChrisYounger = ageOfChris < ageOfJordan; // Chris is younger than Jordan
        boolean isJordanYounger = ageOfJordan < ageOfChris; // Jordan is younger than Chris

        System.out.println("Is Chris younger than Jordan? " + isChrisYounger);
        System.out.println("Is Jordan younger than Chris? " + isJordanYounger);

        System.out.println(); // print a new line


        // Example 2: Comparing heights in centimeters
        int heightOfSophia = 165;
        int heightOfLiam = 175;
        boolean isSophiaTaller = heightOfSophia > heightOfLiam; // Sophia is taller than Liam
        boolean isLiamTaller = heightOfLiam > heightOfSophia; // Liam is taller than Sophia

        System.out.println("Is Sophia taller than Liam? " + isSophiaTaller);
        System.out.println("Is Liam taller than Sophia? " + isLiamTaller);
    }
}