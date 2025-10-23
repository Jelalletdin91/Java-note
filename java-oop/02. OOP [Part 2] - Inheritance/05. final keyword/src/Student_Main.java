public class Student_Main {
    public static void main(String[] args) {
        Student student = new Student(100, "John Smith", "john@email.com", 30);

        student.printStudentData();

        student.setAge(31);
        System.out.println("Updated age is: " + student.getAge());
    }
}
