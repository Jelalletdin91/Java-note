public class PostfixAndPrefixIncrement {
    public static void main(String[] args) {

        // Example 1: Postfix increment - counting completed lessons in a week
        int completedLessons = 3;  // lessons completed so far this week
        int totalLessons = 10;     // total lessons planned for the week
        int remainingLessonsThisWeek = totalLessons - (completedLessons++); // calculate remaining lessons before starting the current lesson

        System.out.println("Remaining Lessons for the Week: " + remainingLessonsThisWeek);    // Should show 7
        System.out.println("Total Completed Lessons (after increment): " + completedLessons); // Should show 4

        System.out.println(); // print a new line

        // Example 2: Prefix increment - calculating final grades after bonus points
        int currentGrade = 85;     // initial grade
        int bonusPoints = 5;       // bonus points to add for a project
        int finalGrade = currentGrade + ++bonusPoints; // increase bonus before calculating final grade

        System.out.println("Final Grade (after adding bonus): " + finalGrade); // Should show 91
        System.out.println("Bonus Points (after increment): " + bonusPoints);  // Should show 6
    }
}