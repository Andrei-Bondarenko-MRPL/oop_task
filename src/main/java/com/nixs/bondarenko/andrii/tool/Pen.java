package com.nixs.bondarenko.andrii.tool;

/**
 * Pen takes 1.15 writing substance for writing of each symbol
 */
public class Pen extends WritingTools {
    private static final double SUBSTANCE_FOR_ONE_LETTER = 1.15;

    @Override
    public double getSubstance() {
        return (double) Math.round((numberOfSymbols * SUBSTANCE_FOR_ONE_LETTER) * 100) / 100;
    }

    @Override
    public String toString() {
        return String.format("Pen, remainder %s, %s, %s - %s",
                getRemainingWritingSubstance(), getLine(), getLine().length(), numberOfSymbols);
    }
}
