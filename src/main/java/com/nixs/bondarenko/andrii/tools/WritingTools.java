package com.nixs.bondarenko.andrii.tools;


public abstract class WritingTools implements Comparable<WritingTools> {

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
    public int compareTo(WritingTools tools) {
        return Double.compare(getRemainingWritingSubstance(), tools.getRemainingWritingSubstance());
    }
}
