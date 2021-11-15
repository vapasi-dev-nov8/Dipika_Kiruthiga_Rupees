package com.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RupeesTest {

    @Test
    void shouldReturnTrueIfBothDenominationsAreEqual(){
        Rupees rupees = new Rupees(10,10);
        assertTrue(rupees.compareRupees());
    }

    @Test
    void shouldAddTwoDenominations(){
        Rupees rupees = new Rupees(2,5);
        assertEquals(7,rupees.getTotalRupees());
    }

}
