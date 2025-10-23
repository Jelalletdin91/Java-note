public class SwitchFallThroughDemo {
    public static void main(String[] args) {

        char grade = 'B';

        System.out.println("Grade: " + grade);

        switch (grade) {
            case 'A':
                System.out.println("Excellent! You have achieved top marks.");
                // No break statement, so it will fall through to case 'B'

            case 'B':
                System.out.println("Good job, but there’s room for improvement.");
                // No break statement, so it will fall through to case 'C'

            case 'C':
                System.out.println("You passed, but more effort is needed to improve.");
                // No break statement, so it will fall through to case 'F'

            case 'F':
                System.out.println("You failed, but don't give up. Study harder next time.");
                // No break statement, so it will fall through to default

            default:
                System.out.println("Note: Make sure to input a valid grade (A, B, C, or F).");
        }
    }
}