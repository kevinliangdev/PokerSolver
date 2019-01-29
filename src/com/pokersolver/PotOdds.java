package com.pokersolver;

public class PotOdds {


    private double potTotal;
    private double toCall;

    public PotOdds(double potTotal, double toCall) throws Exception{
        if (potTotal < 0 || toCall < 0) {
            throw new Exception("inputs cannot be negative");
        }

        setPotTotal(potTotal);
        setToCall(toCall);
    }

    public Double potOddsRatioCalculation() {
        double reward = potTotal/toCall;
        return CustomUtilities.roundNDecimalDigits(reward, 2);
    }

    public Double potOddsEquityNeededCalculation() {
        double equityNeeded = CustomUtilities.roundNDecimalDigits(1 / ((Math.round((potTotal / toCall)*100.0) / 100.0) + 1) * 100.0, 2);
        return equityNeeded;
    }

    @Override
    public String toString() {
        String rewardString = Double.toString(potOddsRatioCalculation());
        String equityString = Double.toString(potOddsEquityNeededCalculation());
        return "You have pot odds of [" +
                rewardString + ":1] " + "and need at least [" +
                equityString + "] % to continue.";
    }

    public double getPotTotal() {
        return potTotal;
    }



    public void setPotTotal(double potTotal) {
        this.potTotal = potTotal;
    }

    public double getToCall() {
        return toCall;
    }

    public void setToCall(double toCall) {
        this.toCall = toCall;
    }


}
