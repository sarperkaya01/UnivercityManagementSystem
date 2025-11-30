package com.unimanagementsys.Util.NoteCalculator;

import com.unimanagementsys.Util.NoteCalculator.Abstracts.NoteAbstract;

public class Visa extends NoteAbstract {

    public final static double weight =0.4;
    public Visa(double note) {
        super( note);
        
    }

    @Override
    public double calculateWeightedNote() {
       return weight * note;
    }

}
