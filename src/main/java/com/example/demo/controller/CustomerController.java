package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public Customer findById(@PathVariable Long id){
        return  customerService.findById(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return  customerService.save(customer);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        customerService.deleteById(id);
    }

    @GetMapping("exists/{id}")
    public boolean existsById(@PathVariable Long id){
        return customerService.existsById(id);
    }

    @GetMapping()
    public Customer findByFullName(@RequestParam String fullName){
        return customerService.findByFullName(fullName);
    }
}
