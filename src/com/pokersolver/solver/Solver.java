package com.pokersolver.solver;

import com.pokersolver.algorithms.ExpectedValue;
import com.pokersolver.algorithms.Outs;
import com.pokersolver.algorithms.PotOdds;

public class Solver {

    private PotOdds potOdds;
    private Outs outs;
    private ExpectedValue ev;

    private static Solver solver;

    private Solver() {

    }

    public static Solver getInstance() {
        if (solver==null) {
            solver = new Solver();

        }

        return solver;
    }
    public void createPotOdds() throws InstantiationException{

        potOdds = new PotOdds();

    }

    public PotOdds createPotOdds(double potTotal, double toCall) throws IllegalArgumentException{

            potOdds = new PotOdds(potTotal, toCall);


        return getPotOdds();
    }

    public PotOdds getPotOdds() {
        return potOdds;
    }

    public Outs createOuts(int outs) throws IllegalArgumentException{
        this.outs = new Outs(outs);
        return getOuts();
    }

    public void createOuts() throws InstantiationException{
        outs = new Outs();


    }

    public Outs getOuts() {
        return outs;
    }

    public void createEV() throws InstantiationException{
        ev = new ExpectedValue();


    }

    public ExpectedValue createEV(double equity, double toCall, double totalPot) throws IllegalArgumentException{
        this.ev = new ExpectedValue(equity, toCall, totalPot);
        return ev;

    }




}
