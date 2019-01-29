package com.pokersolver;

public final class CustomUtilities {

    public static double roundNDecimalDigits(double number, double decimalDigits) {
        return Math.round(number * Math.pow(10.0, decimalDigits)) / Math.pow(10.0, decimalDigits);
    }
}
