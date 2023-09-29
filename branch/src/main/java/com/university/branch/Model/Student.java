package com.university.branch.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Student")
public class Student {

    @Id

    private Long studentId;

    @NotBlank(message = "First name is required")
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First name should start with a capital letter")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 25, message = "Age must not exceed 25")
    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;




    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}