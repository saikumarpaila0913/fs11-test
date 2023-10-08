package com.geekster.Student.model.Repo;

import com.geekster.Student.model.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
}
