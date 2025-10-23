public class MultiDimensionalArraysDemo {
    public static void main(String[] args) {

        // Create a 2D array with two rows
        int[][] marks = new int[2][];

        // Initialize the sub-arrays with three columns each
        marks[0] = new int[3]; // Sub-array for student 1
        marks[1] = new int[3]; // Sub-array for student 2

        // Assign values to the first sub-array (student 1)
        marks[0][0] = 67; // Insert at index 0 of the sub-array at index 0 of the marks array
        marks[0][1] = 80; // Insert at index 1 of the sub-array at index 0 of the marks array
        marks[0][2] = 95; // Insert at index 2 of the sub-array at index 0 of the marks array

        // Assign values to the second sub-array (student 2)
        marks[1][0] = 95; // Insert at index 0 of the sub-array at index 1 of the marks array
        marks[1][1] = 90; // Insert at index 1 of the sub-array at index 1 of the marks array
        marks[1][2] = 88; // Insert at index 2 of the sub-array at index 1 of the marks array

        // Print the 2D array using nested loops
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); // Print a new line after printing the values of a sub-array
        }
    }
}