package com.generateData.Controller;

import com.generateData.Entity.Teacher;
import com.generateData.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
