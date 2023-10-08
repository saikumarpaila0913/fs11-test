package com.geekster.Student.model.Repo;

import com.geekster.Student.model.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {
}
