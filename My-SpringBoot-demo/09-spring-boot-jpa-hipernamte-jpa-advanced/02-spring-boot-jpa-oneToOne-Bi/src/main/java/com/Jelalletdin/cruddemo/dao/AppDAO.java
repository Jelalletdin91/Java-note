package com.Jelalletdin.cruddemo.dao;

import com.Jelalletdin.cruddemo.entity.Instructor;
import com.Jelalletdin.cruddemo.entity.InstructorDetail;


public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void delete(int theId);

    InstructorDetail instructorDetail(int theId);

    void deleteInstructorDetailId(int theId);

}
