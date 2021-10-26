package com.example.completeProject.springbootajaxcrud.repository;

import com.example.completeProject.springbootajaxcrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


//   public List<User> findByEmailAndPassword(String email, String password);
}
