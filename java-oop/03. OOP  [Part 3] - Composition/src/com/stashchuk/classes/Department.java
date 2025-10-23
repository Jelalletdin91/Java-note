package com.stashchuk.classes;


public class Department {
    private String name;
    private String description;
    private int employeeCapacity; // total number of employees a department can have
    private Employee[] employees;
    private int index = 0;        // position to add the new employee in the "employees" array

    public Department(String name, String description, int employeeCapacity) {
        this.name = name;
        this.description = description;
        this.employeeCapacity = employeeCapacity;
    }

    public Department(String name, String description, int capacity, Employee[] employees) {
        this(name, description, capacity);
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        if (this.employees == null) {
            this.employees = new Employee[this.employeeCapacity];
        }

        if (this.index < this.employees.length) {
            this.employees[index] = employee;
            index++;
        }
        else {
            System.out.println("Failed to add employee in the department - Department has reached its capacity");
        }
    }

    @Override
    public String toString() {
        String departmentString = "";

        departmentString += "\n====================\n";
        departmentString += "\tDepartment\n";
        departmentString += "====================\n";
        departmentString += "name = " + name;
        departmentString += "\ndescription = " + description;
        departmentString += "\nemployeeCapacity = " + employeeCapacity;

        for (int i = 0; i < index; i++) {
            departmentString += this.employees[i].toString();
        }

        departmentString += "====================";

        return departmentString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmployeeCapacity() {
        return employeeCapacity;
    }

    public void setEmployeeCapacity(int employeeCapacity) {
        this.employeeCapacity = employeeCapacity;
    }

    // no setter for "employees" because we want
    // to allow adding a new employee only using the
    // "addEmployee" method or via the parameterized constructor
    public Employee[] getEmployees() {
        return employees;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
