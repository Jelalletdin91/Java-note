package com.Jelalletdin.demo.servise;

import com.Jelalletdin.demo.dao.EmployeeRepository;
import com.Jelalletdin.demo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeServise {

    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository theEmployeeDao){
        employeeRepository =theEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);
        Employee tempEmployee = null;

        if (result.isPresent()){
            tempEmployee= result.get();
        }else {
            throw new RuntimeException("Did not find employee id: " + theId);
        }


        return tempEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteEmployeeById(int theId) {
        employeeRepository.deleteById(theId);
    }
}

