package com.instagramapp.instagram.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PostId;
    private Timestamp CreatedDate;
    private Timestamp updatedDate;
    private String Caption;

   @ManyToOne
   @JoinColumn(name = "fk_user")
    User user;

}
