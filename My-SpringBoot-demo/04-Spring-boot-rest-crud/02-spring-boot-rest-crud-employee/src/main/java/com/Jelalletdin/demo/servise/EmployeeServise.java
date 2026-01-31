package com.Jelalletdin.demo.servise;

import com.Jelalletdin.demo.entity.Employee;

import java.util.List;

public interface EmployeeServise {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteEmployeeById(int theId);
}
