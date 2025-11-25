package com.unimanagementsys.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unimanagementsys.Entities.UserRoles;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles,Long>{

}
