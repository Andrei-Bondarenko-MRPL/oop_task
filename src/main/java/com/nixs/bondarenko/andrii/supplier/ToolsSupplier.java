package com.nixs.bondarenko.andrii.supplier;

import com.nixs.bondarenko.andrii.tool.Marker;
import com.nixs.bondarenko.andrii.tool.Pen;
import com.nixs.bondarenko.andrii.tool.Pencil;
import com.nixs.bondarenko.andrii.tool.WritingTools;

import java.util.Random;

/**
 * In this class creates an array with three types writing tools(pencil, pen, marker) in random order. Array's capacity is 10.
 */
public class ToolsSupplier {
    private final Random random = new Random();
    private static final int NUMBERS_OF_TOOLS = 3;
    private static final int CAPACITY_OF_ARRAY = 10;

    /**
     *In this method writing tools array is filled when called private method getRandomTools(). And return full tools array.
     * @return array tools which we use for writing
     */
    public WritingTools[] getArrayOfTools() {
        WritingTools[] tools = new WritingTools[CAPACITY_OF_ARRAY];
        for (int i = 0; i < tools.length; i++) {
            tools[i] = getRandomTools();
        }
        return tools;
    }

    /**
     * This method returns random writing tools.
     * @return random tool
     */
    private WritingTools getRandomTools() {
        return switch (random.nextInt(NUMBERS_OF_TOOLS)) {
            case 0 -> new Pen();
            case 1 -> new Pencil();
            default -> new Marker();
        };
    }
}
