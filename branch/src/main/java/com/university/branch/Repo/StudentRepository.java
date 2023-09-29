package com.university.branch.Repo;

import com.university.branch.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// StudentRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}

// EventRepository.java


