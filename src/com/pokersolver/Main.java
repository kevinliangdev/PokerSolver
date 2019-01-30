package com.pokersolver;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the poker solver app!");
        System.out.println("test change!");

        Solver solver = Solver.getInstance();

        solver.createPotOdds(1, 1);
        String message = solver.getPotOdds().toString();
        System.out.println(message);

    }
}
