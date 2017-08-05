package com.create_project.create_project.Service;

import com.create_project.create_project.Data.UserRepository;
import com.create_project.create_project.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by CMONCHICOURT on 18/07/2017.
 */
@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }


}
