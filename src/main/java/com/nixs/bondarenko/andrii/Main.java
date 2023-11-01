package com.nixs.bondarenko.andrii;

import com.nixs.bondarenko.andrii.abstracts.WritingInstrument;
import com.nixs.bondarenko.andrii.supplier.InstrumentSupplier;
import com.nixs.bondarenko.andrii.writing.WriteText;

import java.util.Arrays;

public class Main {
    private static final int NUMBER_OF_TIMES = 10;

    public static void main(String[] args) {
        InstrumentSupplier supplier = new InstrumentSupplier();
        WritingInstrument[] instruments = supplier.getArrayOfInstrument();
        WriteText text = new WriteText();

        for (WritingInstrument instrument : instruments) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < NUMBER_OF_TIMES; i++) {
                String write = instrument.write(new StringBuilder(), text.getArrayChars());
                builder.append(write);
            }
            instrument.setRemainingWritingSubstance(instrument.getSubstance());
        }

        Arrays.sort(instruments);

        System.out.println(Arrays.toString(instruments));
    }
}
