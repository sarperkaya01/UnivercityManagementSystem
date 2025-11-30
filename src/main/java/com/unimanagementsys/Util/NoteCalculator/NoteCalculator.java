package com.unimanagementsys.Util.NoteCalculator;



public class NoteCalculator{

    public double avgCalculator(INote note1,INote note2){
        return note1.calculateWeightedNote()+note2.calculateWeightedNote();

    }

    

}


