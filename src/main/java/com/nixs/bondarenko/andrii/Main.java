package com.nixs.bondarenko.andrii;

import com.nixs.bondarenko.andrii.filling.FillingArray;
import com.nixs.bondarenko.andrii.tools.WritingTools;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FillingArray fillingArray = new FillingArray();
        WritingTools[] filledArray = fillingArray.getFilledArray();
        System.out.println(Arrays.toString(filledArray));
    }
}
