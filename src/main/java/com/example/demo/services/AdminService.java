package com.example.demo.services;

import com.example.demo.model.Admin;
import com.example.demo.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Optional<Admin> findByEmail(String email) {
        return adminRepository.findByEmail(email);
    }
}
