package com.geekster.Student.model.Service;

import com.geekster.Student.model.Model.Student;
import com.geekster.Student.model.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Student_Service {
    @Autowired
    StudentRepo studentRepository;


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public Student getStudentById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.orElse(null);
    }



    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }


    public Student updateStudent(Long id, Student updatedStudent) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setAge(updatedStudent.getAge());
            existingStudent.setPhoneNumber(updatedStudent.getPhoneNumber());
            existingStudent.setBranch(updatedStudent.getBranch());
            existingStudent.setDepartment(updatedStudent.getDepartment());

            // Update student fields here
            // student.setName(updatedStudent.getName());
            // ...
            return studentRepository.save(existingStudent);
        } else {
            return null;
        }
    }


    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
