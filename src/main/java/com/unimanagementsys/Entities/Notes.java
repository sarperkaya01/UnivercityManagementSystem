package com.unimanagementsys.Entities;

import java.util.UUID;

import com.unimanagementsys.Util.Enums.NoteTypes;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Notes {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student studentId;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lessonId;

    @Enumerated(EnumType.STRING)
    @Column(name = "note_type", nullable = false, updatable = false)
    private NoteTypes noteType;

    @Column(name = "note_point", nullable = false, updatable = false)
    private double notePoint;

}
