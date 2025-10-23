public class Student_Static {
    // instance fields
    private long id;
    private String fullName;
    private String email;
    private int age;

    // static field
    private static int studentInstanceCounter = 0;

    public Student_Static(long id, String fullName, String email, int age) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.age = age;

        // static fields are usually accessed
        // using the class name
        Student_Static.studentInstanceCounter++;
    }

    public static void printCreatedStudentsCount() {
        System.out.println("Total instances created of Student class: " + Student_Static.studentInstanceCounter);
    }
}
