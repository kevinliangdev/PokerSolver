package com.pokersolver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCustomUtilities {

    @Test
    void testCustomUtilRoundNDigits() {



        assertThrows(InstantiationException.class,
                ()->{
                    new CustomUtilities();
                });


        double d = 5.12345;
        assertEquals(5.123, CustomUtilities.roundNDecimalDigits(d,3));
    }
}
