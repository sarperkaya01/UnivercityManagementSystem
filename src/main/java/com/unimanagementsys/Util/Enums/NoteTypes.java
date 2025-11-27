package com.unimanagementsys.Util.Enums;

public enum NoteTypes {
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

    public double calculateWeightedAvg(double visa, double fin) {

        return (visa * VISA.weight) + (fin * FINAL.weight);
    }

    public double calculateWeightedAvgResit(double fin, double resit) {
        return ((fin * (1 - RESIT.weight)) + (resit * RESIT.weight));
    }

}
