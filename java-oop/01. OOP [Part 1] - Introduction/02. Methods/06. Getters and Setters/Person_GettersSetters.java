public class Person_GettersSetters {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3 || name.length() > 25) {
            System.out.println("ERROR - name should contain at-least 3 and maximum of 25 characters");
        }
        else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 120) {
            System.out.println("ERROR - age cannot be less than 1 and greater than 120");
        }
        else {
            this.age = age;
        }
    }
}
