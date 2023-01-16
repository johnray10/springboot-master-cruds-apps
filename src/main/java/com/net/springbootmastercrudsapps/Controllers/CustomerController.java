package com.net.springbootmastercrudsapps.Controllers;

import com.net.springbootmastercrudsapps.Models.Customer.Customer;
import com.net.springbootmastercrudsapps.Models.Customer.CustomerService;
import com.net.springbootmastercrudsapps.Models.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customers")
    public String getCustomerList(Model model) {
        model.addAttribute("customers", customerService.findAllCustomer());
        return "views/customer/index";
    }

    @GetMapping(value = "/addCustomers")
    public String addCustomer(Model model, Student student) {
        model.addAttribute("customers", student);
        return "views/customer/create";
    }

    /*Customer update*/
    @GetMapping(value = "/edit-customers/{id}")
    public String updateCustomer(@PathVariable(value = "id") Long id, Model model) {
        Customer customer = customerService.getById(id);
        model.addAttribute("customers", customer);
        return "views/customer/update";
    }

    @RequestMapping(value = "/customers/findById")
    @ResponseBody
    public Optional<Customer> findById(Long id) {
        return customerService.findById(id);
    }

    @PostMapping(value = "/customers-create")
    public String add(Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }

    @RequestMapping(value = "/customers/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }

    @RequestMapping(value = "/customers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id) {
        customerService.deleteById(id);
        return "redirect:/customers";
    }
}
