package com.university.branch.Service;

import com.university.branch.Model.Department;
import com.university.branch.Model.Student;
import com.university.branch.Repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;




    public String  addStudent(Student student) {
        // Implement validation and business logic here
        studentRepository.save(student);
        return "Added";
    }

    public String updateStudentDepartment(Long studentId, Department department) {

        Optional<Student> optionalStudent = studentRepository.findById(studentId);


            Student student = optionalStudent.get();
            student.setDepartment(department);
            studentRepository.save(student); // Save the updated student
            return "Updated";







        // Implement validation and business logic here
       // Student student = getStudentById(studentId);
        //student.setDepartment(department);
        //return "Updated";
    }

    public String deleteStudent(Long studentId) {

        // Implement validation and business logic here
        studentRepository.deleteById(studentId);
        return "Deleted";
    }

    public List<Student> getAllStudents() {

        return (List<Student>) studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long studentId) {
        return  studentRepository.findById(studentId);

    }
}
