package com.unimanagementsys.Util.Enums;

public enum NoteTypes {// bu oranlar bolume gore degisecek
    VISA(0.4),
    FINAL(0.6),
    RESIT(0.5);

    private final double weight;

    NoteTypes(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public  double weightedNote(double note) {
        return note * this.weight;
    }

   

}
