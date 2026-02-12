package com.Jelalletdin.cruddemo.dao;

import com.Jelalletdin.cruddemo.entity.Course;
import com.Jelalletdin.cruddemo.entity.Instructor;
import com.Jelalletdin.cruddemo.entity.InstructorDetail;

import java.util.List;


public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void delete(int theId);

    InstructorDetail instructorDetail(int theId);

    void deleteInstructorDetailId(int theId);

    List<Course> findCoursesByINstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update (Instructor instructor);

    void update(Course course);

    Course findCourseById(int theId);

    void deleteCourseById(int theId);

    void saveCourse(Course theCourse);

    Course findCourseAndReviewsById(int theId);

}
