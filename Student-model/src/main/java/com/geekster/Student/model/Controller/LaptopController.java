package com.geekster.Student.model.Controller;

import com.geekster.Student.model.Model.Laptop;
import com.geekster.Student.model.Service.Laptop_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Laptop")
public class LaptopController {
    @Autowired
    Laptop_Service laptopService;

    @GetMapping("/Laptop/all")
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @GetMapping("/laptop/{id}")
    public Laptop getLaptopById(@PathVariable Long id) {
        return laptopService.getLaptopById(id);
    }

    @PostMapping("/laptop")
    public Laptop createLaptop(@RequestBody Laptop laptop) {
        return laptopService.createLaptop(laptop);
    }

    @PutMapping("/laptop/{id}")
    public Laptop updateLaptop(@PathVariable Long id, @RequestBody Laptop laptop) {
        return laptopService.updateLaptop(id, laptop);
    }

    @DeleteMapping("/laptop/{id}")
    public void deleteLaptop(@PathVariable Long id) {
        laptopService.deleteLaptop(id);
    }
}
