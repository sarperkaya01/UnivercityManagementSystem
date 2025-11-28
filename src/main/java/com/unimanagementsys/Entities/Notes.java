package com.unimanagementsys.Entities;

import java.util.List;
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

    public static double calculateWeightedAvg(double visa, double fin) {

        return (visa * NoteTypes.VISA.getWeight()) + (fin * NoteTypes.FINAL.getWeight());
    }

    public static double calculateWeightedAvgResit(double fin, double resit) {
        return ((fin * (1 - NoteTypes.RESIT.getWeight())) + (resit * NoteTypes.RESIT.getWeight()));
    }

    public void weightedAvgNotePoint(List<Notes> notes) {

        Notes visaNote = notes.stream()
                .filter(type -> NoteTypes.VISA.equals(type.noteType))
                .findFirst()
                .orElse(null);

        Notes finalNote = notes.stream()
                .filter(type -> NoteTypes.FINAL.equals(type.noteType))
                .findFirst()
                .orElse(null);

        Notes resitNote = notes.stream()
                .filter(type -> NoteTypes.RESIT.equals(type.noteType))
                .findFirst()
                .orElse(null);
        boolean passed = false;
        if (resitNote != null) {
            passed = this.lessonId.getPassingNote() < calculateWeightedAvgResit(finalNote.notePoint,
                    resitNote.notePoint);

        } else {
            passed = this.lessonId.getPassingNote() < calculateWeightedAvg(visaNote.notePoint, finalNote.notePoint);
        }
        studentId.isGradeUp(passed);

    }

}
