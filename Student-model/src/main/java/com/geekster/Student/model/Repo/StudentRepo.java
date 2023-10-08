package com.geekster.Student.model.Repo;

import com.geekster.Student.model.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
