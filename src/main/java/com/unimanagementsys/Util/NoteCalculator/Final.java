package com.unimanagementsys.Util.NoteCalculator;

import com.unimanagementsys.Util.NoteCalculator.Abstracts.NoteAbstract;

public class Final extends NoteAbstract {// implementasyonun nedeni abstractin extend-implemente ettigi interface

    private final static double weight = 0.6;

    public Final(double note) {
        super(note);

    }

    @Override
    public double calculateWeightedNote() {
        return weight * note;
    }

    // @Override
    // public double calculateWeightedNote() {

    // return super.calculateWeightedNote() + 1;

    // }
    // burda yapilan override isleme gerekli degil yalnizca "mevcut mantigin
    // otesinde ben bunu degistirmek istedim"
}
