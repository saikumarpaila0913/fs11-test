package com.geekster.Student.model.Repo;

import com.geekster.Student.model.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Long> {
}
