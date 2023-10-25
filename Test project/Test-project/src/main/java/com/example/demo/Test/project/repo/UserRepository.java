package com.example.demo.Test.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Test.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
