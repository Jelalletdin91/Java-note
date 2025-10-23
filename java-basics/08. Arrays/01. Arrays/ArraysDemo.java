public class ArraysDemo {
    public static void main(String[] args) {

        // Create an integer array of size 5 to store students' marks
        int[] marks = new int[5];

        // Assign marks to the array
        marks[0] = 79; // Student 1
        marks[1] = 85; // Student 2
        marks[2] = 90; // Student 3
        marks[3] = 58; // Student 4
        marks[4] = 88; // Student 5

        // Print array elements with a descriptive message
        System.out.println("Marks of the students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}