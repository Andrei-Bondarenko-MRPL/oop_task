package com.nixs.bondarenko.andrii.supplier;

import com.nixs.bondarenko.andrii.instruments.Marker;
import com.nixs.bondarenko.andrii.instruments.Pen;
import com.nixs.bondarenko.andrii.instruments.Pencil;
import com.nixs.bondarenko.andrii.abstracts.WritingInstrument;

import java.util.Random;

public class InstrumentSupplier {
    private final Random random = new Random();
    private static final int NUMBERS_OF_INSTRUMENT = 3;
    private static final int CAPACITY_OF_ARRAY = 10;

    private WritingInstrument getRandomInstrument() {
        return switch (random.nextInt(NUMBERS_OF_INSTRUMENT)) {
            case 0 -> new Pen();
            case 1 -> new Pencil();
            default -> new Marker();
        };
    }

    public WritingInstrument[] getArrayOfInstrument() {
        WritingInstrument[] instruments = new WritingInstrument[CAPACITY_OF_ARRAY];
        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = getRandomInstrument();
        }
        return instruments;
    }
}
