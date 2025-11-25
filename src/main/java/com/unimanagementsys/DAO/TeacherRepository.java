package com.unimanagementsys.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unimanagementsys.Entities.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {

}
