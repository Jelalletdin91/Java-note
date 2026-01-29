package com.Jelalletdin.crud_demo.dao;

import com.Jelalletdin.crud_demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDAO{

    //define fields for EntityManager
    private EntityManager entityManager;

    //define Constructor
    @Autowired
    public StudentDaoImpl (EntityManager entityManager){
        this.entityManager=entityManager;
    }

    //Implement save Method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        //create Query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student ", Student.class);//From id 1 to infinity
        //TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName asc", Student.class); //From A to Z
       // TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName desc", Student.class);//From Z to A


        //display query results
        return theQuery.getResultList();

    }

    @Override
    public List<Student> findByLastName(String thelastName) {
        //create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);

        //set query parameters
        theQuery.setParameter("theData", thelastName);

        //return Query result
        return theQuery.getResultList();

    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        //reteive the tusdent
        Student thestudent = entityManager.find(Student.class, id);

        //Delete the student
        entityManager.remove(thestudent);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return numRowsDeleted;
    }
}