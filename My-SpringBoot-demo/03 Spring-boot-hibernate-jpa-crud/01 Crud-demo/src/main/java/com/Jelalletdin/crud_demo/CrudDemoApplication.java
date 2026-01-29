package com.Jelalletdin.crud_demo;

import com.Jelalletdin.crud_demo.dao.StudentDAO;
import com.Jelalletdin.crud_demo.dao.StudentDaoImpl;
import com.Jelalletdin.crud_demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner-> {

			//createMStudent(studentDAO);
			
			createMStudent(studentDAO);
			
			readFromId(studentDAO);

			queryForStudents(studentDAO);

			queryForStudentsByLastName(studentDAO);
			
		};
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudent = studentDAO.findByLastName("Berjanov");

		//display list of students
		for (Student tempStudent : theStudent){
			System.out.println(tempStudent);
			//System.out.println();
		}

	}

	private void readFromId(StudentDAO studentDAO) {
		//Create a student object
		System.out.println("Student is creating...");
		Student tempStudent = new Student("Aly", "Asyrov", "Aasyrovgmail.com");

		//Save the Student
		System.out.println("Student is saving...");
		studentDAO.save(tempStudent);

		//display id the saved Student
		int theId = tempStudent.getId();
		System.out.println("Created student(s): "+ theId);

		//retrieve the student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		//display  Student
		System.out.println("Found the student: "+myStudent);
	}

	private void createMStudent(StudentDAO studentDAO) {
		//create Multiple students object
		System.out.println("3 Students are creating...");
		Student tempStu1= new Student("Jelalletdin", "Berjanov", "jelilberjanovgmail.com");
		Student tempStu2= new Student("Aman", "Meredov", "ameredovgmail.com");
		Student tempStu3= new Student("Meret", "Amanov", "mamanovgmail.com");

		//save students object
		System.out.println("3 Students are saving");
		studentDAO.save(tempStu1);
		studentDAO.save(tempStu2);
		studentDAO.save(tempStu3);

		//display id of the students
		System.out.println("Created Student: " + tempStu3.getId());
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Student is creating...");
		Student tempStu= new Student("Jelalletdin", "Berjanov", "jelilberjanovgmail.com");

		//save the  student object
		System.out.println("Student is saving...");
		studentDAO.save(tempStu);

		//display id of the student
		System.out.println("Created student " + tempStu.getId());
	}


	private void queryForStudents(StudentDAO studentDao){
		//get a List of Students
		List<Student> theStudents= studentDao.findAll();

		//display list of students
		for (Student student : theStudents){
			System.out.println(student);
		}
	}

}
