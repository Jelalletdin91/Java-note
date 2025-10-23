public class ForEachLoopArraysDemo {
  public static void main(String[] args) {
      // Create a 2D array and initialize it with values directly
      int[][] studentMarks = {
          {67, 80, 95}, // Marks for student 1
          {95, 90, 88}  // Marks for student 2
      };

      // Print the 2D array using nested for-each loops
      for (int[] marksForStudent : studentMarks) {
          for (int mark : marksForStudent) {
              System.out.print(mark + " "); // Print each mark

          }
          System.out.println(); // Print a new line after printing the values of a sub-array
      }
  }
}