package com.unimanagementsys.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unimanagementsys.Entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
