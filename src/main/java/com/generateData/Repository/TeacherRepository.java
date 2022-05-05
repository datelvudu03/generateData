package com.generateData.Repository;

import com.generateData.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

}
