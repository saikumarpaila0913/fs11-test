package com.geekster.Student.model.Service;

import com.geekster.Student.model.Model.Course;
import com.geekster.Student.model.Repo.CourseRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Course_Service {
    CourseRepo courseRepository;


    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }


    public Course getCourseById(Long id) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        return optionalCourse.orElse(null);
    }


    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }


    public Course updateCourse(Long id, Course updatedCourse) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if (optionalCourse.isPresent()) {
            Course existingCourse = optionalCourse.get();

            existingCourse.setTitle(updatedCourse.getTitle());
            existingCourse.setDescription(updatedCourse.getDescription());
            existingCourse.setDuration(updatedCourse.getDuration());

            // Update course fields here
            // course.setTitle(updatedCourse.getTitle());
            // ...
            return courseRepository.save(existingCourse);
        } else {
            return null;
        }
    }


    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }




}
