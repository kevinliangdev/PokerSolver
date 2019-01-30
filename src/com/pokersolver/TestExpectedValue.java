package com.pokersolver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestExpectedValue {

    Solver solver = Solver.getInstance();

    @Test
    void testEV() {

        ExpectedValue ev = solver.createEV(87.9,100,200);
        assertEquals(75.80, ev.getEV());

    }

    @Test
    void testIllegalArguments() {

        assertThrows(IllegalArgumentException.class,
                ()->{
                    solver.createEV(-5, 1, 3);
                });

        assertThrows(IllegalArgumentException.class,
                ()->{
                    solver.createEV(3, -1, 3);
                });

        assertThrows(IllegalArgumentException.class,
                ()->{
                    solver.createEV(5, 3 , -9);
                });

        assertThrows(InstantiationException.class,
                ()->{
                    solver.createEV();
                });


    }

    @Test
    void testToString() {
        ExpectedValue ev = solver.createEV(87.9,100,200);
        assertEquals("EV: 75.8", ev.toString());

    }




}
