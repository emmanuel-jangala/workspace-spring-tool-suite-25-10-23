package com.example.demo.Test.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Test.project.entities.Student;
import com.example.demo.Test.project.repo.StudentRepository;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepo;
       
    @GetMapping("/students")
    public List<Student> listAll(Model model) {
        List<Student> listStudents = studentRepo.findAll();
        model.addAttribute("listStudents", listStudents);
           
        return listStudents;
    }
       
}
