package com.geekster.Student.model.Service;

import com.geekster.Student.model.Model.Laptop;
import com.geekster.Student.model.Repo.LaptopRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Laptop_Service {
    LaptopRepo laptopRepository;


    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }


    public Laptop getLaptopById(Long id) {
        Optional<Laptop> optionalLaptop = laptopRepository.findById(id);
        return optionalLaptop.orElse(null);
    }


    public Laptop createLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }


    public Laptop updateLaptop(Long id, Laptop updatedLaptop) {
        Optional<Laptop> optionalLaptop = laptopRepository.findById(id);
        if (optionalLaptop.isPresent()) {
            Laptop existingLaptop = optionalLaptop.get();
            existingLaptop.setName(updatedLaptop.getName());
            existingLaptop.setBrand(updatedLaptop.getBrand());
            existingLaptop.setPrice(updatedLaptop.getPrice());
            return laptopRepository.save(existingLaptop);
        } else {
            return null;
        }
    }


    public void deleteLaptop(Long id) {
        laptopRepository.deleteById(id);
    }

}
