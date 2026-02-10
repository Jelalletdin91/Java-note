package com.Jelalletdin.cruddemo.dao;

import com.Jelalletdin.cruddemo.entity.Instructor;


public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void delete(int theId);

}
