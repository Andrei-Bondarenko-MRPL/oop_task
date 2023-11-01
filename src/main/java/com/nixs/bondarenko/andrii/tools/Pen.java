package com.nixs.bondarenko.andrii.tools;

public class Pen extends WritingTools {
    private static final double SUBSTANCE_FOR_ONE_LETTER = 1.15;
    private int numberOfLetters = 0;

    @Override
    public double getSubstance() {
        return (double) Math.round((numberOfLetters * SUBSTANCE_FOR_ONE_LETTER) * 100) / 100;
    }

    @Override
    public String erase(StringBuilder builder) {
        return null;
    }

    @Override
    public String write(StringBuilder builder, char[] chars) {
        for (char letter : chars) {
            numberOfLetters++;
            builder.append(letter);
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return "Pen - " + "substance: " + getRemainingWritingSubstance();
    }
}