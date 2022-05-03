package com.example.generateData.Controller;

import com.example.generateData.Entity.Teacher;
import com.example.generateData.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TeacherController {
    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping(path = "/teachers")
    List<Teacher> all(){
        return teacherRepository.findAll();
    }

}
