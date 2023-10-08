package com.geekster.Student.model.Repo;

import com.geekster.Student.model.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
