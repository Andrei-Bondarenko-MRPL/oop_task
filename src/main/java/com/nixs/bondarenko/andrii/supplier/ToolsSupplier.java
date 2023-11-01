package com.nixs.bondarenko.andrii.supplier;

import com.nixs.bondarenko.andrii.tools.Marker;
import com.nixs.bondarenko.andrii.tools.Pen;
import com.nixs.bondarenko.andrii.tools.Pencil;
import com.nixs.bondarenko.andrii.tools.WritingTools;

import java.util.Random;

public class ToolsSupplier {
    private final Random random = new Random();
    private static final int NUMBERS_OF_TOOLS = 3;
    private static final int CAPACITY_OF_ARRAY = 10;

    private WritingTools getRandomTools() {
        return switch (random.nextInt(NUMBERS_OF_TOOLS)) {
            case 0 -> new Pen();
            case 1 -> new Pencil();
            default -> new Marker();
        };
    }

    public WritingTools[] getArrayOfTools() {
        WritingTools[] tools = new WritingTools[CAPACITY_OF_ARRAY];
        for (int i = 0; i < tools.length; i++) {
            tools[i] = getRandomTools();
        }
        return tools;
    }
}
