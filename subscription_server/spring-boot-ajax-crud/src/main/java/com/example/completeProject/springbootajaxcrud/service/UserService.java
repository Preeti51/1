package com.example.completeProject.springbootajaxcrud.service;


import com.example.completeProject.springbootajaxcrud.entity.User;
import com.example.completeProject.springbootajaxcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    public void saveOrUpdateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
    public User getUserByEmailAndPassword(String Email, String Password){
//        System.out.println(Email);
//        System.out.println(Password);

        //using repository search
//        List<User> users= (List<User>) userRepository.findByEmailAndPassword(Email,Password);
//        if(users.size()>0){
//           return users.get(0);
//        }
//       return userRepository.findByEmailAndPassword(Email,Password);

        // custom method
         List<User> users = this.getUserList();
         for(User user: users){
             if(user.getEmail().equals(Email)&&user.getPassword().equals(Password)){
                 return user;
             }
         }
        return null;
    }
}
