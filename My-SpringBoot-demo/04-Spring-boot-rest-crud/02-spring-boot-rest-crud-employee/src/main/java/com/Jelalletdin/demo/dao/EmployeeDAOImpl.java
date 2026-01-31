package com.Jelalletdin.demo.dao;

import com.Jelalletdin.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    //create entityManager field
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public EmployeeDAOImpl(EntityManager theEnityManager){
        entityManager=theEnityManager;
    }

    @Override
    public List<Employee> findAll() {

        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

        //execute query and get query list
        List<Employee> employees = theQuery.getResultList();

        //return resul
        return employees;
    }

    @Override
    public Employee findById(int theId) {
        //find Employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        //return Employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        //save Employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        //return saved Employee
        return dbEmployee;
    }

    @Override
    public void deleteEmployeeById(int theId) {
        //find Employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);

        //remove Employee
        entityManager.remove(theEmployee);


    }
}
