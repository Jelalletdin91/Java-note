package com.Jelalletdin.cruddemo;

import com.Jelalletdin.cruddemo.dao.AppDAO;
import com.Jelalletdin.cruddemo.entity.Instructor;
import com.Jelalletdin.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
		};
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
