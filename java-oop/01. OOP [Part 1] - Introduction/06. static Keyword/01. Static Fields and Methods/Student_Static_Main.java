public class Student_Static_Main {
    public static void main(String[] args) {
        Student_Static mike = new Student_Static(1, "Mike Larson", "mike@email.com", 20);
        Student_Static peter = new Student_Static(2, "Peter Clark ", "peter@email.com", 25);
        Student_Static liam = new Student_Static(3, "Liam Stephan", "liam@email.com", 19);

        Student_Static.printCreatedStudentsCount();
    }
}
