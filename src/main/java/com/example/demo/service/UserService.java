package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepository iCustomerRepository;

    public List<User> findCustomers() {
        return (List<User>) iCustomerRepository.findAll();
    }
}
