package com.Jelalletdin.demo.servise;

import com.Jelalletdin.demo.dao.EmployeeDAO;
import com.Jelalletdin.demo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServise {

    EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO theEmployeeDao){
        employeeDAO =theEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int theId) {
        employeeDAO.deleteEmployeeById(theId);
    }
}

