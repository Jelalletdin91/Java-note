package com.Jelalletdin.demo.dao;

import com.Jelalletdin.demo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteEmployeeById(int theId);

}
