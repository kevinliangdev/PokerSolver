package com.pokersolver;

public class Solver {

    private PotOdds potOdds;
    private Outs outs;

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

    public Outs createOuts(int outs) {
        this.outs = new Outs(outs);
        return getOuts();
    }

    public Outs createOuts() throws InstantiationException{
        this.outs = new Outs();
        return outs;

    }

    public Outs getOuts() {
        return outs;
    }




}
