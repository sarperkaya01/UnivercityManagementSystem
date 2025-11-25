package com.unimanagementsys.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unimanagementsys.Entities.TeachersLessons;

@Repository
public interface TeachersLessonsRepository extends JpaRepository<TeachersLessons,Long> {

}
