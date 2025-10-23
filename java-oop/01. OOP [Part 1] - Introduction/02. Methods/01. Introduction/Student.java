public class Student {
    private long id;
    private String fullName;
    private String email;
    private int age;

    public Student() {
        id = 100;
        fullName = "John";
        email = "john@email.com";
        age = 20;
    }

    public void printStudentData() {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }
}
