package com.example.demo.Test.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Test.project.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
 
}
