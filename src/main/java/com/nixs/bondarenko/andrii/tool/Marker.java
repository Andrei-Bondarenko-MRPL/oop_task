package com.nixs.bondarenko.andrii.tool;

public class Marker extends WritingTools {
    private static final double TWENTY_SYMBOLS = 20;
    private static final double FORTY_SYMBOLS = 40;
    private static final double COEFFICIENT_FIRST_PHASE = 1.0;
    private static final double COEFFICIENT_SECOND_PHASE = 1.09;
    private static final double COEFFICIENT_THIRD_PHASE = 1.21;
    private static final double FIRST_PHASE = 20 * 1.0;
    private static final double RESULT_TWO_PHASES = (20 * 1.0) + (20 * 1.09);

    @Override
    public double getSubstance() {
        double returnDouble;
        if (numberOfSymbols <= TWENTY_SYMBOLS) {
            returnDouble = numberOfSymbols * COEFFICIENT_FIRST_PHASE;
        } else if (numberOfSymbols <= FORTY_SYMBOLS) {
            returnDouble = FIRST_PHASE + (numberOfSymbols - TWENTY_SYMBOLS) * COEFFICIENT_SECOND_PHASE;
        } else {
            returnDouble = RESULT_TWO_PHASES + (numberOfSymbols - FORTY_SYMBOLS) * COEFFICIENT_THIRD_PHASE;
        }
        return (double) Math.round(returnDouble * 100) / 100;
    }

    @Override
    public String erase(StringBuilder builder) {
        return builder.toString();
    }

    @Override
    public String toString() {
        return String.format("Marker, remainder %s, %s, %s - %s",
                getRemainingWritingSubstance(), getLine(), getLine().length(), numberOfSymbols);
    }
}
