package com.pokersolver;

public class Solver {

    private PotOdds potOdds;

    private static Solver solver;

    private Solver() {

    }

    public static Solver getInstance() {
        if (solver==null) {
            solver = new Solver();

        }

        return solver;
    }

    public PotOdds createPotOdds(double potTotal, double toCall) throws IllegalArgumentException{

            potOdds = new PotOdds(potTotal, toCall);


        return getPotOdds();
    }

    public PotOdds getPotOdds() {
        return potOdds;
    }


}
