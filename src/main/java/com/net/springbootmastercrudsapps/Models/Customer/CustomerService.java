package com.net.springbootmastercrudsapps.Models.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public List<Customer> findAllCustomer(){
        return customerDao.findAll();
    }

    public Optional<Customer> findById(Long id) {
        return customerDao.findById(id);
    }

    // get id update
    public Customer getById(Long id){
        return customerDao.findById(id).get();
    }

    //Delete
    public void deleteById(Long id) {
        customerDao.deleteById(id);
    }

    //Update
    public void save(Customer customer) {
        customerDao.save(customer);
    }
}
