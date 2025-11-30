package com.unimanagementsys.Util.NoteCalculator.Abstracts;

import com.unimanagementsys.Util.NoteCalculator.INote;

public abstract class NoteAbstract implements INote {
    
    protected double note;

    public NoteAbstract( double note) {
        
        this.note = note;
    }

   
    

}
