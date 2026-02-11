package com.Jelalletdin.cruddemo;

import com.Jelalletdin.cruddemo.dao.AppDAO;
import com.Jelalletdin.cruddemo.entity.Course;
import com.Jelalletdin.cruddemo.entity.Instructor;
import com.Jelalletdin.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO){
		return runner->{
			createInstructor(appDAO);

			//findInstructor(appDAO);

			//deleteInstructor(appDAO);

			//findInstructorDetailById(appDAO);

			//deleteInstructorDetailById(appDAO);

			//createInstructorWithCourses(appDAO);

			//findInstructorWithCoursew(appDAO);

			findCourseForInstructor(appDAO);
		};
	}

	private void findCourseForInstructor(AppDAO appDAO) {

		int theId=2;

		System.out.println("Finding instructor Id: " + theId);

		Instructor instructor = appDAO.findInstructorById(theId);

		System.out.println("tempInstructor" + instructor);

		System.out.println("Finding course for instructor id: " + theId);
		List<Course> courses = appDAO.findCoursesByINstructorId(theId);
		instructor.setCourses(courses);

		System.out.println("The associated courses: "+ instructor.getCourses());
		System.out.println("Done");

	}

	private void findInstructorWithCoursew(AppDAO appDAO) {
		int theId=2;

		Instructor instructor = appDAO.findInstructorById(theId);

		System.out.println("Instructor: " + instructor);
		System.out.println("Courses: " + instructor.getCourses());

	}

	private void createInstructorWithCourses(AppDAO appDAO) {

		Instructor instructor=new Instructor("Jelal", "Berjnaov", "jijigmail.com");

		InstructorDetail instructorDetail= new InstructorDetail("Video", "pull up");

		instructor.setInstructorDetail(instructorDetail);

		Course football= new Course("Football Trainer");
		Course basketball = new Course("Basketball trainer");

		instructor.add(football);
		instructor.add(basketball);

		System.out.println("The instructor is saving: " + instructor);
		System.out.println("The courses: " + instructor.getCourses());
		appDAO.save(instructor);
		System.out.println("Done");

	}

	private void deleteInstructorDetailById(AppDAO appDAO) {

		int theId=3;

		System.out.println("Deleting Instructor Details by ID: " + theId);
		appDAO.deleteInstructorDetailId(theId);
		System.out.println("DONE..");

	}

	private void findInstructorDetailById(AppDAO appDAO) {

		int theId=3;


		InstructorDetail tempInstructorDetail = appDAO.instructorDetail(theId);

		System.out.println("the instructor detail: " + tempInstructorDetail);
		System.out.println("The Instructor is" + tempInstructorDetail.getInstructor());
	}

	private void deleteInstructor(AppDAO appDAO) {

		int theId=1;
		System.out.println("Deleting the Instructor...");
		appDAO.delete(theId);
		System.out.println("Done");

	}

	private void findInstructor(AppDAO appDAO) {

		int theId=1;
		System.out.println("Instructor is searcing ...");
		Instructor tempInstructor = appDAO.findInstructorById(theId);

		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println(tempInstructor.getInstructorDetail());

	}

	private void createInstructor(AppDAO appDAO) {

		Instructor tempInstructor = new Instructor("Jelalletdin", "Berjanov","jelilberjanovgmail.com");

		InstructorDetail tempInstructorDetail= new InstructorDetail("Dawah", "Programming");

		tempInstructor.setInstructorDetail(tempInstructorDetail);

		System.out.println("Instructor is saving: " + tempInstructor);
		appDAO.save(tempInstructor);
		System.out.println("Done");

	}

}
