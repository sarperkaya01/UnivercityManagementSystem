package com.unimanagementsys.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_role")
@Data // getter + setter + toString + equals + hashcode
@NoArgsConstructor // parametresiz constructor
@AllArgsConstructor
public class UserRole<T> {

    @Column(name = "user_id", nullable = false, updatable = false)
    private T userId;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role roleId;
}
