package com.stashchuk.inheritance;

public class Employee extends Person {
    private String department;
    private String jobTitle;
    private double salary;
    private String companyName;

    public Employee() {
        this.department = "not-assigned";
        this.jobTitle = "unknown";
        this.salary = 0;
        this.companyName = "unknown";
    }

    public Employee(
        String name,
        int age,
        String gender,
        String department,
        String jobTitle,
        double salary,
        String companyName
    ) {
        // initialize fields defined in the "Person" class.
        // we use setter methods because "private" instance
        // fields of the parent class are not directly accessible
        // from child classes
        setFullName(name);
        setAge(age);
        setGender(gender);

        // initialize fields specific to Employee objects
        this.department = department;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }
}
