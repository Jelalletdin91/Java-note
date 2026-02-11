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

    @Override
    @Transactional
    public void delete(int theId) {
        Instructor theInstructor = entityManager.find(Instructor.class, theId);
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


}
