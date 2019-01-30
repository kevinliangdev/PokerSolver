package com.pokersolver;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestPotOdds {

    Solver solver = Solver.getInstance();

    @Test
    void testPotOdds() {
        PotOdds potOdds = solver.createPotOdds(36,12);
        assertEquals(36, potOdds.getPotTotal());
        assertEquals(12, potOdds.getToCall());
        assertEquals( 3.0,  potOdds.potOddsRatioCalculation());
        assertEquals(25.0,  potOdds.potOddsEquityNeededCalculation());
    }

    @Test
    void testPotOddsThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                ()->{
                    solver.createPotOdds(-2, 5);
                });

        assertThrows(IllegalArgumentException.class,
                ()->{
                    solver.createPotOdds(5, -2);
                });

    }

    @Test
    void testPotOddsToString() {
        PotOdds potOdds = solver.createPotOdds(36,12);
        assertEquals("You have pot odds of [3.0:1] and need at least [25.0] % to continue.",
                potOdds.toString());

    }









}
