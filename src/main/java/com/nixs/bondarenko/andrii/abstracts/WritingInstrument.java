package com.nixs.bondarenko.andrii.abstracts;


public abstract class WritingInstrument implements Comparable<WritingInstrument> {

    private double remainingWritingSubstance;

    public double getRemainingWritingSubstance() {
        return remainingWritingSubstance;
    }

    public void setRemainingWritingSubstance(double remainingWritingSubstance) {
        this.remainingWritingSubstance = remainingWritingSubstance;
    }

    public abstract String write(StringBuilder builder, char[] chars);

    public abstract String erase(StringBuilder builder);

    public abstract double getSubstance();

    @Override
    public int compareTo(WritingInstrument instrument) {
        return Double.compare(getRemainingWritingSubstance(), instrument.getRemainingWritingSubstance());
    }
}
