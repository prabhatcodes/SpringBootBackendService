package com.gfg.prabhat.SpringBootBackendService.service;

import com.gfg.prabhat.SpringBootBackendService.model.User;
import com.gfg.prabhat.SpringBootBackendService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){

        List<User> users = userRepository.findAll();
        return users;
    }

    public User findUserById(Long id){

        User user = userRepository.findById(id);
        return user;

    }

    public User createUser(User user){

        userRepository.save(user);
        System.out.println("User added Succesfully!");
        return user;

    }

    public void deleteUser(Long id){

        User user = findUserById(id);
        userRepository.delete(user);

    }
}
