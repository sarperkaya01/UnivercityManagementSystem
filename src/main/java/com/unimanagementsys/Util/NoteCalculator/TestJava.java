package com.unimanagementsys.Util.NoteCalculator;

public class TestJava {

    public static void main(String[] args) {
        INote note1 = testMethod();
        INote note2 = testMethod();
        INote note3 = testMethod();

        NoteCalculator nc = new NoteCalculator();
        double result = nc.avgCalculator(note1, note2);

        System.out.println(note1.getClass().getName());
        System.out.println(note2.getClass().getName());
        System.out.println(result);

    }

    public static INote testMethod() {
        double a = Math.random();
        if (a < 0.33) {
            return new Visa(43);
        } else if (a < 0.66) {
            return new Final(76);

        } else {
            return new Resit(90);
        }
    }

}
