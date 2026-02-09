package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    //add Mapping
    @GetMapping("/list")
    public String employeeList(Model theModel){

        List<Employee> employees=employeeService.findAll();

        theModel.addAttribute("employees", employees);

        return "employee/employee-list";

    }

    @GetMapping("/ShowForm")
    public String ShowForm (Model theModel){

        Employee employee = new Employee();

        theModel.addAttribute("employee", employee);

        return "employee/employee-form";

    }

    @PostMapping("/employeeSave")
    public String save(@ModelAttribute("employee") Employee theEmployee){

        employeeService.save(theEmployee);

        return "redirect:/employees/list";

    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){

        Employee theEmployee = employeeService.findById(theId);

        theModel.addAttribute("employee", theEmployee);

        return "employee/employee-form";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int theId){

        employeeService.deleteById(theId);

        return "redirect:/employees/list";

    }

}
