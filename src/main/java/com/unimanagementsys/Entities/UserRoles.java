package com.unimanagementsys.Entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@Data // getter + setter + toString + equals + hashcode
@NoArgsConstructor // parametresiz constructor
@AllArgsConstructor
public class UserRoles {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "role_name", nullable = false, updatable = false)
    private String roleName;
}
