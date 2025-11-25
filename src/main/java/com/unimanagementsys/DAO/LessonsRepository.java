package com.unimanagementsys.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unimanagementsys.Entities.Lessons;

@Repository
public interface LessonsRepository extends JpaRepository<Lessons,Long>{

}
