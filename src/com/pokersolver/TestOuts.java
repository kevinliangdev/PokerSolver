package com.pokersolver;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestOuts {

    Solver solver = Solver.getInstance();

    @Test
    void testTwoCardLeft() {
        Outs outs = solver.createOuts(8);
        assertEquals(31.45, outs.percentWhenTwoCardsLeft());
    }

    @Test
    void testOneCardLeft() {
        Outs outs = solver.createOuts(8);
        assertEquals(17.02, outs.percentWhenOnlyOneCardLeft());
    }

    @Test
    void testIllegalArgument() {
        assertThrows(IllegalArgumentException.class,
                ()->{
                    solver.createOuts(-2);
                });

        assertThrows(InstantiationException.class,
                ()->{
                    solver.createOuts();
                });
    }


}
