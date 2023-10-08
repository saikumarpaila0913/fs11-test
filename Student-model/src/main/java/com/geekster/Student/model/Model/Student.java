package com.geekster.Student.model.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long ID;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne
    @JoinColumn(name="fk_Address")
    private Address address;

    @ManyToMany
    @JoinTable(name="Student_Course",joinColumns = @JoinColumn(name="student_id"),inverseJoinColumns = @JoinColumn(name="course_id"))
    Set<Course> courseSet;

    @OneToMany(mappedBy="student")
    Set<Laptop> laptops;



}
