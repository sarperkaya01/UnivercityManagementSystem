package com.unimanagementsys.Util.NoteCalculator;

import com.unimanagementsys.Util.NoteCalculator.Abstracts.NoteAbstract;

public class Resit extends NoteAbstract{

    private final static double weight = 0.5;
    public Resit(double note) {
        super( note);
       
    }

    @Override
    public double calculateWeightedNote() {
        return note * weight; 
    }

}
