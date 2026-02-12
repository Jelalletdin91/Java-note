package com.Jelalletdin.cruddemo.dao;

import com.Jelalletdin.cruddemo.entity.Course;
import com.Jelalletdin.cruddemo.entity.Instructor;
import com.Jelalletdin.cruddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AppDAOImpl implements AppDAO{

    public EntityManager entityManager;

    @Autowired
    public AppDAOImpl(EntityManager theEntityManager){
        this.entityManager=theEntityManager;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        entityManager.persist(theInstructor);
    }

    @Override
    public Instructor findInstructorById(int theId) {
        return entityManager.find(Instructor.class, theId);
    }

    /*@Override
    @Transactional
    public void delete(int theId) {
        Instructor theInstructor = entityManager.find(Instructor.class, theId);
        entityManager.remove(theInstructor);
    }*/
    @Override
    @Transactional
    public void delete(int theId) {
        Instructor theInstructor = entityManager.find(Instructor.class, theId);

        List<Course> courses = theInstructor.getCourses();

        for (Course tempCourse : courses){
            tempCourse.setInstructor(null);
        }

        entityManager.remove(theInstructor);
    }

    @Override
    public InstructorDetail instructorDetail(int theId) {
        return entityManager.find(InstructorDetail.class, theId);
    }

    @Override
    @Transactional
    public void deleteInstructorDetailId(int theId) {

        InstructorDetail instructorDetail = entityManager.find(InstructorDetail.class, theId);

        instructorDetail.getInstructor().setInstructorDetail(null);

        entityManager.remove(instructorDetail);

    }

    @Override
    public List<Course> findCoursesByINstructorId(int theId) {

        TypedQuery<Course> query = entityManager.createQuery("from Course where instructor.id = :data", Course.class);

        query.setParameter("data", theId);

        List<Course> courses = query.getResultList();

        return courses;

    }

    @Override
    public Instructor findInstructorByIdJoinFetch(int theId) {

        TypedQuery<Instructor> query = entityManager.createQuery("select i from Instructor i " +
                                                                    "JOIN FETCH i.courses " +
                                                                    "JOIN FETCH i.instructorDetail "+
                                                                    "where i.id = :data", Instructor.class);

        query.setParameter("data", theId);

        Instructor instructor = query.getSingleResult();

        return instructor;

    }

    @Override
    @Transactional
    public void update(Instructor instructor) {
        entityManager.merge(instructor);
    }

    @Override
    @Transactional
    public void update(Course course) {
        entityManager.merge(course);
    }

    @Override
    public Course findCourseById(int theId) {
        Course course = entityManager.find(Course.class, theId);

        return course;

    }

    @Override
    @Transactional
    public void deleteCourseById(int theId) {

        Course tempCourse = entityManager.find(Course.class, theId);

        entityManager.remove(tempCourse);


    }

    @Override
    @Transactional
    public void saveCourse(Course theCourse) {
        entityManager.persist(theCourse);
    }

    @Override
    public Course findCourseAndReviewsById(int theId) {

        TypedQuery<Course> query = entityManager.createQuery("select c from Course c JOIN FETCH c.reviews where c.id = :data", Course.class);

        query.setParameter("data", theId);

        Course course = query.getSingleResult();


        return course;
    }


}
