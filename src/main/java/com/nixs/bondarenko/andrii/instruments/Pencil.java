package com.nixs.bondarenko.andrii.instruments;

import com.nixs.bondarenko.andrii.abstracts.WritingInstrument;

public class Pencil extends WritingInstrument {
    private static final double FULL_SUBSTANCE = 100;
    private static final double SUBSTANCE_FOR_ONE_LETTER = 0.95;
    private int numberOfLatter = 0;

    @Override
    public double getSubstance() {
        return FULL_SUBSTANCE - (double) Math.round((numberOfLatter * SUBSTANCE_FOR_ONE_LETTER) * 100) / 100;
    }

    @Override
    public String erase(StringBuilder builder) {
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    @Override
    public String write(StringBuilder builder, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            numberOfLatter++;
            builder.append(chars[i]);
            if (i == chars.length - 1) {
                return erase(builder);
            }
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return "Pencil-- " + getRemainingWritingSubstance();
    }
}
