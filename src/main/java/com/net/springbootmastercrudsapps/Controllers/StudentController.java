package com.net.springbootmastercrudsapps.Controllers;


import com.net.springbootmastercrudsapps.Config.FileUploadUtil;
import com.net.springbootmastercrudsapps.Models.Student.Student;
import com.net.springbootmastercrudsapps.Models.Student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.List;

@Controller
public class StudentController {

    @Autowired private StudentService studentService;


    /*retrieve data*/
    @GetMapping(value = "/students")
    public String showStudents(Model model) {
        List<Student> students  = studentService.findAllList();
        model.addAttribute("students", students);
        return "views/student/index";
    }

    //show customer-add
    @GetMapping(value = "/addStudents")
    public String addStudents(Model model){
        Student student = new Student();
        model.addAttribute("students", student);
        return "views/student/create";
    }

    @PostMapping("/create-students")
    public RedirectView saveStudents(@ModelAttribute("students") Student student,
                                     @RequestParam("image") MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        student.setPhoto(fileName);
        Student savedStudent = studentService.saveStudent(student);
        String uploadDir = "user-photos/" + savedStudent.getId();
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        return new RedirectView("/students", true);

    }

    @GetMapping(value = "/edit-students/{id}")
    public String UpdateImage(@PathVariable(value = "id") Long id, Model model) {
        //set list gender
        List<Student> studentList = studentService.findAllList();
        model.addAttribute("student",studentList);
        // set employee as a model attribute to pre-populate the form
        Student student = studentService.getStudentById(id);
        model.addAttribute("students",student);
        return "views/student/update";
    }

    @GetMapping("/delete-students/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id) {
        // call delete employee method
        this.studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
