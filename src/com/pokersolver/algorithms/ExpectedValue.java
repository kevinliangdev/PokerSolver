package com.pokersolver.algorithms;

import com.pokersolver.util.CustomUtilities;

public class ExpectedValue {

    private double equity;
    private double pot;
    private double toCall;

    public ExpectedValue() throws InstantiationException{
        throw new InstantiationException("Please enter equity %");
    }

    public ExpectedValue(double equity, double toCall, double totalPot) throws IllegalArgumentException {
        if (equity < 0 || equity > 100 || totalPot <= 0 || toCall <= 0) {
            throw new IllegalArgumentException("Please enter valid arguments");
        }
        else {
            this.equity = CustomUtilities.roundNDecimalDigits(equity/100, 4);
            pot = totalPot;
            this.toCall = toCall;
        }

    }


    public double getEV() {
        double ev = equity * (pot+toCall) - toCall;

        return CustomUtilities.roundNDecimalDigits(ev, 1);
    }

    public String toString() {
        return "EV: " + getEV();
    }






}
