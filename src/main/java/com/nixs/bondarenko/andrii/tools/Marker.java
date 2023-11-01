package com.nixs.bondarenko.andrii.tools;

public class Marker extends WritingTools {
    private static final double TWENTY_LETTERS = 20;
    private static final double FORTY_LETTERS = 40;
    private int numberOfLetters = 0;

    @Override
    public double getSubstance() {
        double returnDouble;
        if (numberOfLetters <= TWENTY_LETTERS) {
            returnDouble = 20 * 1.0;
        } else if (numberOfLetters <= FORTY_LETTERS) {
            returnDouble = (20 * 1.0 + 20 * 1.09);
        } else {
            returnDouble = ((20 * 1.0) + (20 * 1.09) + (numberOfLetters - 40) * 1.21);
        }
        return (double) Math.round(returnDouble * 100) / 100;
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
        return "Marker - " + "substance: " + getRemainingWritingSubstance();
    }
}
