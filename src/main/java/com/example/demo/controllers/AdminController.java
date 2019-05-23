package com.example.demo.controllers;

import com.example.demo.model.Admin;
import com.example.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @PostMapping("/findByEmail")
    public Optional<Admin> findByEmail(@RequestBody Admin admin) {
        return adminService.findByEmail(admin.getEmail());
    }


    @GetMapping("/")
    public String testSecurity() {
        return "victory";
    }

}
