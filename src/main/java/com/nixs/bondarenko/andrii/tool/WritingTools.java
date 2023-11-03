package com.nixs.bondarenko.andrii.tool;

/**
 * This class is abstract. All instrument inherit it. Use interface Comparable for add sorting order
 */

public abstract class WritingTools implements Comparable<WritingTools> {
    private double remainingWritingSubstance;
    int numberOfSymbols;
    private String line;

    public double getRemainingWritingSubstance() {
        return remainingWritingSubstance;
    }

    public void setRemainingWritingSubstance(double remainingWritingSubstance) {
        this.remainingWritingSubstance = remainingWritingSubstance;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    /**
     *  This method determines how mush writing substance used for writing all symbols
     * @return how much writing substance was use
     */
    public abstract double getSubstance();

    /**
     * This method can be used by overriding for tool which can erase text, and deletes each last symbol in each iteration during writing and returns new string
     * This method returns the same string if tool can't erase
     * @param builder for erase last symbol
     * @return new string without last symbol
     */
    public String erase(StringBuilder builder) {
        return builder.toString();
    }

    /**
     * This method takes as input two parameters- StringBuilder and char array. Count numbers of symbols.
     * And return string. In all child classes this method is same.
     * @param builder for build string from chars array
     * @param chars
     * @return string for each writing tool
     */
    public String write(StringBuilder builder, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            numberOfSymbols++;
            builder.append(chars[i]);
            if (i == chars.length - 1) {
                return erase(builder);
            }
        }
        return builder.toString();
    }

    /**
     * Method compareTo is using for sorting an array by remainder writing substance.
     * @param tools the object to be compared.
     * @return
     */
    @Override
    public int compareTo(WritingTools tools) {
        return Double.compare(getRemainingWritingSubstance(), tools.getRemainingWritingSubstance());
    }
}
