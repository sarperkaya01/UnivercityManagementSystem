package com.unimanagementsys.Entities;

import java.util.UUID;

import com.unimanagementsys.Util.Enums.Grade;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@Data                       // getter + setter + toString + equals + hashcode
@NoArgsConstructor          // parametresiz constructor
@AllArgsConstructor         // tüm alanlar için constructor
@Builder                    // builder pattern-method chain
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "student_number", unique = true, nullable = false)
    private String studentNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "grade", nullable = false)
    private Grade grade;

   // studen number generator
   

}