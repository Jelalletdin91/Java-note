package com.Jelalletdin.cruddemo;

import com.Jelalletdin.cruddemo.dao.AppDAO;
import com.Jelalletdin.cruddemo.entity.*;
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

			//createCourseAndStudents(appDAO);

			//findCourseAndStudent(appDAO);

			//findStudentAndCourse(appDAO);

			//addMoreStudents(appDAO);

			//deleteCourse(appDAO);

			deleteStudent(appDAO);

		};
	}

	private void deleteStudent(AppDAO appDAO) {

		int theId = 5;

		System.out.println("Deleting student id: " + theId);

		appDAO.deleteStudentById(theId);

		System.out.println("Done!!!!!");

	}

	private void addMoreStudents(AppDAO appDAO) {

		int theId=5;
		Student student = appDAO.findStudentAndCourseByStudentId(theId);

		Course course1=new Course("Gaming");
		Course course2=new Course("Enjoying");

		student.addCourse(course1);
		student.addCourse(course2);

		System.out.println("Updating Student: " + student);
		System.out.println("assoicated course: " + student.getCourses());

		appDAO.updateStudent(student);

		System.out.println("Done");

	}

	private void findStudentAndCourse(AppDAO appDAO) {
		int theId = 5;

		Student student = appDAO.findStudentAndCourseByStudentId(theId);

		System.out.println("Loaded Student: " + student);
		System.out.println("Courses: " + student.getCourses());

		System.out.println("Done");

	}

	private void findCourseAndStudent(AppDAO appDAO) {

		int theId = 12;

		Course course = appDAO.findCourseAndStudentsById(theId);

		System.out.println("Finding course id: " + theId);
		System.out.println("Course: " + course);
		System.out.println("Students: " + course.getStudents());
		System.out.println("Done");

	}

	private void createCourseAndStudents(AppDAO appDAO) {

		Course course = new Course("Java Language");

		course.addStudent(new Student("Merdan", "Nuryyev", "mGmail.com"));
		course.addStudent(new Student("Aly", "Nuryyev", "aGmail.com"));


		System.out.println("Course is saving..." + course);
		System.out.println("associatig  Students...");
		appDAO.saveCourse(course);
		System.out.println("Done!!!!!!!");


	}

	private void deleteCourseAndReviews(AppDAO appDAO) {

		int theId = 10 ;
		System.out.println("Deleting Course.......");
		appDAO.deleteCourseById(theId);
		System.out.println("Done");


	}

	private void retrievCourseAndReviewsById(AppDAO appDAO) {

		int theId=10;

		Course course = appDAO.findCourseAndReviewsById(theId);

		System.out.println(course);
		System.out.println(course.getReviews());

		System.out.println("Done");

	}

	private void createCourseReviews(AppDAO appDAO) {

		Course course = new Course("Gym");

		course.addReview(new Review("It is really cool"));
		course.addReview(new Review("It is really bad"));
		course.addReview(new Review("It is normal"));

		System.out.println("Course is saving...");
		appDAO.saveCourse(course);
		System.out.println("Done");




	}

	//-----------------------------------------------------------------------
	//-----------------------------------------------------------------------
	private void deleteCourse(AppDAO appDAO) {

		int theId = 12;

		System.out.println("Deleting course with id: " + theId);
		appDAO.deleteCourseById(theId);
		System.out.println("DONE!!!");

	}

	private void updateCourse(AppDAO appDAO) {

		int theId=10;

		System.out.println("Updating the course with id: " + theId);
		Course course = appDAO.findCourseById(theId);

		System.out.println("Updating...");
		course.setTitle("Volleyball");
		appDAO.update(course);

		System.out.println("DONE!!!!");

	}

	private void updateInstructor(AppDAO appDAO) {

		int theId=2;

		System.out.println("Updating Instructor with Id: " + theId);
		Instructor instructor = appDAO.findInstructorById(theId);

		System.out.println("Updating Instructor: " + instructor);
		instructor.setFirstName("Jelalletdin");

		appDAO.update(instructor);
		System.out.println("Done!");

	}

	private void findInstructorWithJoinFetch(AppDAO appDAO){

		int theId=2;

		System.out.println("Finding Instructor with id: " + theId);
		Instructor instructor = appDAO.findInstructorByIdJoinFetch(theId);

		System.out.println("Instructor: " + instructor);
		System.out.println("Courses: " + instructor.getCourses());
		System.out.println("Done");


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

		int theId=2;
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
