package com.nixs.bondarenko.andrii.util;

import com.nixs.bondarenko.andrii.supplier.ToolsSupplier;
import com.nixs.bondarenko.andrii.tool.WritingTools;

import java.util.Arrays;
import java.util.Random;

public class FillingArray {
    private static final int FULL_SUBSTANCE = 100;
    private static final int NUMBER_OF_TIMES = 10;
    private static final int MIN_TIMES = 3;
    private static final int MAX_TIMES = 6;
    private static final int MIN_NUMBERS_CHAR = 97;
    private static final int MAX_NUMBERS_CHAR = 122;
    private final ToolsSupplier supplier = new ToolsSupplier();

    public WritingTools[] getFilledArray() {
        WritingTools[] tools = supplier.getArrayOfTools();
        for (WritingTools tool : tools) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < NUMBER_OF_TIMES; i++) {
                String write = tool.write(new StringBuilder(), getArrayChars());
                builder.append(write);
            }
            tool.setLine(builder.toString());
            double substance = tool.getSubstance();
            tool.setRemainingWritingSubstance(FULL_SUBSTANCE - substance);
        }
        Arrays.sort(tools);
        return tools;
    }

    private char[] getArrayChars() {
        Random random = new Random();
        char[] chars = new char[random.nextInt(MIN_TIMES, MAX_TIMES)];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) random.nextInt(MIN_NUMBERS_CHAR, MAX_NUMBERS_CHAR);
        }
        return chars;
    }
}
