package com.pokersolver.util;

public  final class CustomUtilities {

    public CustomUtilities() throws InstantiationException
    {
        throw new InstantiationException("Instances of this type are forbidden.");
    }

    public static double roundNDecimalDigits(double number, double decimalDigits) {
        return Math.round(number * Math.pow(10.0, decimalDigits)) / Math.pow(10.0, decimalDigits);
    }
}
