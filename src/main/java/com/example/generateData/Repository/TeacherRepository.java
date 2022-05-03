package com.example.generateData.Repository;

import com.example.generateData.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

}
