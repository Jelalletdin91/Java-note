public class Person_GettersSetters_Main {
    public static void main(String[] args) {

        Person_GettersSetters teacher = new Person_GettersSetters();


        teacher.setName("a");
        teacher.setName("Larry");
        System.out.println("Name: " + teacher.getName());

        teacher.setAge(-10);
        teacher.setAge(40);
        System.out.println("Age: " + teacher.getAge());
    }
}
