package com.unimanagementsys.Entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Teacher {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "name", nullable = false, updatable = false)
    private String name;

    @Column(name = "surname", nullable = false, updatable = false)
    private String surName;

    @Column(name = "major", nullable = false, updatable = false)
    private String major;
}
