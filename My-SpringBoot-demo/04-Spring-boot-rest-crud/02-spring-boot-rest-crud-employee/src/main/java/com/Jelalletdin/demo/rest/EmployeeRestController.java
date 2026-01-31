package com.Jelalletdin.demo.rest;

import com.Jelalletdin.demo.dao.EmployeeDAO;
import com.Jelalletdin.demo.entity.Employee;
import com.Jelalletdin.demo.servise.EmployeeServise;
import org.hibernate.sql.results.graph.embeddable.EmbeddableLoadingLogger;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.json.JsonMapper;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeServise employeeServiseDAO;

    private JsonMapper jsonMapper;

    //Constructor Injection
    public EmployeeRestController(EmployeeServise theemployeeServiseDAO, JsonMapper theJsonMapper){
        employeeServiseDAO=theemployeeServiseDAO;
        jsonMapper = theJsonMapper;
    }

    //Expose employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeServiseDAO.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId){

        Employee theEmployee = employeeServiseDAO.findById(employeeId);

        if (theEmployee == null){
            throw new RuntimeException("Employee with id: " + employeeId + " not found");
        }

        return theEmployee;
    }

    @PostMapping("employees")
    public Employee addEmployee (@RequestBody Employee theEmployee){
        theEmployee.setId(0);

        Employee dbEmployee = employeeServiseDAO.save(theEmployee);

        return dbEmployee;
    }

    @PutMapping("employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeServiseDAO.save(theEmployee);

        return dbEmployee;
    }

    @PatchMapping("/employees/{employeeId}")
    public Employee patchEmployee (@PathVariable int employeeId,
                                   @RequestBody Map<String, Object> patchPayload){
        Employee tempEmployee = employeeServiseDAO.findById(employeeId);

        if (tempEmployee == null){
            throw new RuntimeException("Employee id not found- " + employeeId);
        }

        if (patchPayload.containsKey("id")){
            throw new RuntimeException("Employee id not allowed in rquest body " + employeeId);
        }

        Employee patchedEmployee = jsonMapper.updateValue(tempEmployee, patchPayload);

        Employee dbEmployee = employeeServiseDAO.save(patchedEmployee);

        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployeeById (@PathVariable int employeeId){
        Employee tempEmployee=employeeServiseDAO.findById(employeeId);

        if (tempEmployee==null){
            throw new RuntimeException("ERROR");
        }

        employeeServiseDAO.deleteEmployeeById(employeeId);

        return "Deleted employee by id: " + employeeId;
    }





















}
