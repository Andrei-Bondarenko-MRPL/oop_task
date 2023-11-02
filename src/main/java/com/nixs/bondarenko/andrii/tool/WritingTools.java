package com.nixs.bondarenko.andrii.tool;


public abstract class WritingTools implements Comparable<WritingTools> {
    private double remainingWritingSubstance;
    int numberOfSymbols;
    private String line;

    public double getRemainingWritingSubstance() {
        return remainingWritingSubstance;
    }

    public void setRemainingWritingSubstance(double remainingWritingSubstance) {
        this.remainingWritingSubstance = remainingWritingSubstance;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public abstract double getSubstance();

    public abstract String erase(StringBuilder builder);

    public String write(StringBuilder builder, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            numberOfSymbols++;
            builder.append(chars[i]);
            if (i == chars.length - 1) {
                return erase(builder);
            }
        }
        return builder.toString();
    }

    @Override
    public int compareTo(WritingTools tools) {
        return Double.compare(getRemainingWritingSubstance(), tools.getRemainingWritingSubstance());
    }
}
