package com.pokersolver;

public class Outs {

    int outs;

    public Outs() throws InstantiationException{
        throw new InstantiationException("Please enter number of outs");

    }

    public Outs(int outs) throws IllegalArgumentException {
        if (outs < 0) {
            throw new IllegalArgumentException("Input cannot be 0 or negative");
        }
        this.outs = outs;

    }

    public double percentWhenOnlyOneCardLeft() {
        return CustomUtilities.roundNDecimalDigits((1 - (1 - (double) outs / 47))* 100 , 2);


    }

    public double percentWhenTwoCardsLeft() {
        return CustomUtilities.roundNDecimalDigits((1 - (1 - (double) outs / 47) * (1 - (double) outs / 46)) * 100, 2);
    }

    public String toString() {
        return "The percentage to hit your outs with 1 card left is: " +
                percentWhenOnlyOneCardLeft() + ". If 2 cards left, then: " + percentWhenTwoCardsLeft() + ".";
    }




}
