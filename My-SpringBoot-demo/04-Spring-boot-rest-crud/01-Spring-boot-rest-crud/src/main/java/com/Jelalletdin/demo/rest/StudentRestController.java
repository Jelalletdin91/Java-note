package com.Jelalletdin.demo.rest;

import com.Jelalletdin.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudent;

    @PostConstruct
    public void loadData(){

        theStudent = new ArrayList<>();

        theStudent.add(new Student("Jelalletdin", "Berjanov"));
        theStudent.add(new Student("Aly", "Asyrov"));
        theStudent.add(new Student("Asyr", "Alyyev"));
        theStudent.add(new Student("Aman", "Amanov"));

    }

    //define endpoint "/student"
    @GetMapping("/student")
    List<Student> getStudent(){
        return theStudent;
    }

    @GetMapping("/student/{studentId}")
    public Student getStudentById(@PathVariable int studentId){

        //check student id:
        if (studentId >= theStudent.size() || studentId < 0){
            throw new StudentNotFoundExepcion("Student bby id: " + studentId + " not found");

        }

        return theStudent.get(studentId);
    }

    //add an exeptionhander using an @ExceptionHandler

}
