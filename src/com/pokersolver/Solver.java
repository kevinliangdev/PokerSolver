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

    public void createPotOdds(double potTotal, double toCall) {
        try {
            potOdds = new PotOdds(potTotal, toCall);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public PotOdds getPotOdds() {
        return potOdds;
    }


}
