public class MultiDimensionalArraysWithValuesDemo {
    public static void main(String[] args) {

        // Create a 2D array and initialize it with values directly
        int[][] marks = {
            {67, 80, 95}, // Sub-array for student 1
            {95, 90, 88}  // Sub-array for student 2
        };

        // Print the 2D array using nested loops
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); // Print a new line after printing the values of a sub-array
        }
    }
}