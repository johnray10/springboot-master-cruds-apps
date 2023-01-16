package com.net.springbootmastercrudsapps;

import com.net.springbootmastercrudsapps.Models.Customer.CustomerDao;
import com.net.springbootmastercrudsapps.Models.Student.Student;
import com.net.springbootmastercrudsapps.Models.Student.StudentDao;
import com.net.springbootmastercrudsapps.Models.Student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ApplicationController {

    @Autowired private StudentDao studentDao;

    @Autowired private CustomerDao customerDao;


    @GetMapping(value = "/")
    public String dashboard(Model model){
        model.addAttribute("students",studentDao.countById());
        model.addAttribute("customers", customerDao.countById());
        return "views/dashboard/index";
    }



}
