package com.nixs.bondarenko.andrii.writing;

import java.util.Random;

public class WriteText {
    private static final int MIN_TIMES = 3;
    private static final int MAX_TIMES = 6;
    private static final int MIN_NUMBERS_CHAR = 97;
    private static final int MAX_NUMBERS_CHAR = 122;

    public char[] getArrayChars() {
        Random random = new Random();
        char[] chars = new char[random.nextInt(MIN_TIMES, MAX_TIMES)];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) random.nextInt(MIN_NUMBERS_CHAR, MAX_NUMBERS_CHAR);
        }
        return chars;
    }
}
