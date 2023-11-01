package com.nixs.bondarenko.andrii.filling;

import com.nixs.bondarenko.andrii.supplier.ToolsSupplier;
import com.nixs.bondarenko.andrii.tools.WritingTools;
import com.nixs.bondarenko.andrii.writing.WriteText;

import java.util.Arrays;

public class FillingArray {
    private static final int FULL_SUBSTANCE = 100;
    private final ToolsSupplier supplier = new ToolsSupplier();
    private final WriteText text = new WriteText();

    public WritingTools[] getFilledArray() {
        WritingTools[] tools = supplier.getArrayOfTools();
        for (WritingTools tool : tools) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                String write = tool.write(new StringBuilder(), text.getArrayChars());
                builder.append(write);
            }
            double substance = tool.getSubstance();
            tool.setRemainingWritingSubstance(FULL_SUBSTANCE - substance);
        }
        Arrays.sort(tools);
        return tools;
    }
}
