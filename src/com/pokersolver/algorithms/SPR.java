package com.pokersolver.algorithms;

public class SPR {

    private double stack;
    private double pot;

    public SPR(double stack, double pot) {
        this.stack = stack;
        this.pot = pot;
    }

    public double calcSPR() {
        return this.stack / this.pot;
    }


}
