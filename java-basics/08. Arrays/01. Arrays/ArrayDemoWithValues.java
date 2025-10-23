public class ArrayDemoWithValues {
  public static void main(String[] args) {
      // Create an integer array of size 5 to store students' marks with initial values
      int[] marks = {79, 85, 90, 58, 88}; // Student marks

      // Print array elements with a descriptive message
      System.out.println("Marks of the students:");
      for (int i = 0; i < marks.length; i++) {
          // Using curly braces for the loop
          System.out.printf("Student %d: %d marks%n", (i + 1), marks[i]);
      }
  }
}