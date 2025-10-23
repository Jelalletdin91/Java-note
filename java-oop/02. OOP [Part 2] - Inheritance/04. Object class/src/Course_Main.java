public class Course_Main {
    public static void main(String[] args) {
        Course programmingCourse = new Course("Programming", 3, "Bogdan Stashchuk");

        // print the string representation of "programmingCourse" object
        System.out.println(programmingCourse.toString());

        // "System.out.println" automatically calls the
        // "toString" method if you pass an object to it
        System.out.println(programmingCourse);
    }
}
