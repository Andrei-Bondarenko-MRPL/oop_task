package com.nixs.bondarenko.andrii;

import com.nixs.bondarenko.andrii.util.FillingArray;
import com.nixs.bondarenko.andrii.tool.WritingTools;

public class Main {
    public static void main(String[] args) {
        FillingArray fillingArray = new FillingArray();
        WritingTools[] filledArray = fillingArray.getFilledArray();
        for (WritingTools tool : filledArray) {
            System.out.println(tool);
        }
    }
}
