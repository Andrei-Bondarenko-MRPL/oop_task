package com.nixs.bondarenko.andrii.tool;

public class Pencil extends WritingTools {
    private static final double SUBSTANCE_FOR_ONE_LETTER = 0.95;

    @Override
    public double getSubstance() {
        return (double) Math.round((numberOfSymbols * SUBSTANCE_FOR_ONE_LETTER) * 100) / 100;
    }

    @Override
    public String erase(StringBuilder builder) {
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    @Override
    public String toString() {
        return String.format("Pencil, remainder %s, %s, %s - %s",
                getRemainingWritingSubstance(), getLine(), getLine().length(), numberOfSymbols);
    }
}
