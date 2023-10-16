package com.instagramapp.instagram.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;
    private String firstName;
    private String lastName;
    private Integer age;
    @Column(name="email")
    private String email;
    private String phoneNumber;
    private String Password;




}
