package com.Jelalletdin.demo.dao;

import com.Jelalletdin.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //That is all
}
