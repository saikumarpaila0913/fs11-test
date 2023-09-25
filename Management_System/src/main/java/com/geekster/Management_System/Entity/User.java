package com.geekster.Management_System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class User {
    @NotNull
    @Id
    private Long userId;

    @NotBlank
    private String username;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of birth should be in yyyy-MM-dd format")
    private String dateOfBirth;

    @Email
    private String email;

    @Pattern(regexp = "\\d{12}", message = "Phone number should be 12 digits long")
    private String phoneNumber;

    private Date date;

    private String time;

    // Getters and setters
}
