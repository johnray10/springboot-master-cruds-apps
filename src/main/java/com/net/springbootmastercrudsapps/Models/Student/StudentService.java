package com.net.springbootmastercrudsapps.Models.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired private StudentDao studentDao;

    /*get customer list*/
    public List<Student> findAllList(){
        return studentDao.findAll();
    }

    /*save data */
    public Student saveStudent(Student student){
        return this.studentDao.save(student);
    }

    /*get a by id*/
    public Student getStudentById(Long id){
        Optional<Student> optional = studentDao.findById(id);
        Student student = null;
        if (optional.isPresent()){
            student = optional.get();
        }else{
            throw new RuntimeException(" Student not found for id :: " + id);
        }
        return student;
    }

    /* get a by id */
    public Student findById(Long id){
        return studentDao.findById(id).orElse(null);
    }

    /* delete id */
    public void deleteStudentById(Long id){
        this.studentDao.deleteById(id);
    }


}
