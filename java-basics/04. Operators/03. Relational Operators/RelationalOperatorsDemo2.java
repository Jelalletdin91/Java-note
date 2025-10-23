public class RelationalOperatorsDemo2 {
    public static void main(String[] args) {

        // Example 1: Comparing ages of two siblings
        int ageOfSiblingOne = 25;
        int ageOfSiblingTwo = 30;
        boolean isSiblingOneYoungerOrEqual = ageOfSiblingOne <= ageOfSiblingTwo; // checks if Sibling One is younger than or the same age as Sibling Two

        System.out.println("Is Sibling One younger than or equal to Sibling Two? " + isSiblingOneYoungerOrEqual);

        System.out.println(); // print new line

        // Example 2: Comparing grades of two students
        int gradeOfStudentA = 90;
        int gradeOfStudentB = 90;
        boolean isStudentAGreaterOrEqual = gradeOfStudentA >= gradeOfStudentB; // checks if Student A's grade is greater than or equal to Student B's grade

        System.out.println("Is Student A's grade greater than or equal to Student B's grade? " + isStudentAGreaterOrEqual);
    }
}