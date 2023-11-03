package com.nixs.bondarenko.andrii.tool;

/**
 * Pencil takes 0.95 writing substance for writing of each symbol
 */
public class Pencil extends WritingTools {
    private static final double SUBSTANCE_FOR_ONE_LETTER = 0.95;

    /**
     * This method determines how mush writing substance used for writing all symbols
     * @return how much writing substance was use
     */
    @Override
    public double getSubstance() {
        return (double) Math.round((numberOfSymbols * SUBSTANCE_FOR_ONE_LETTER) * 100) / 100;
    }

    /**
     * This method deletes each last symbol in each iteration in tools which can erase
     * @param builder for erase last symbol
     * @return new string without last symbol
     */
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
