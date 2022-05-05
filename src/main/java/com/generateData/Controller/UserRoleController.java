package com.generateData.Controller;

import com.generateData.Entity.UserRole;
import com.generateData.Repository.UserRepository;
import com.generateData.Repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRoleController {
    @Autowired
    private UserRoleRepository userRoleRepository;

    @GetMapping("/userRoles")
    List<UserRole> all(){
        return userRoleRepository.findAll();
    }
}
