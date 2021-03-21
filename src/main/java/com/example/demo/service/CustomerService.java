package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.ICustomerDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired
    private ICustomerDal customerDal;

    public Customer findById(Long id){
        return  customerDal.findById(id).get();
    }

    public Customer save(Customer customer){
        customer.setFullName();
        return  customerDal.save(customer);
    }

    public void deleteById(Long id){
        customerDal.deleteById(id);
    }

    public boolean existsById(Long id){
        return customerDal.existsById(id);
    }

    public Customer findByFullName(String fullName){
        return customerDal.findByFullName(fullName);
    }
}
