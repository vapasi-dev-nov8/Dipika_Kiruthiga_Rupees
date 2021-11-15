package com.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RupeesTest {

    @Test
    void shouldReturnTrueIfBothDenominationsAreEqual(){
        Rupees rupeesObject1 = new Rupees(10);
        Rupees rupeesObject2 = new Rupees(10);
        assertEquals(rupeesObject1, rupeesObject2);
    }

    @Test
    void shouldAddTwoDenominations(){
        Rupees rupee = new Rupees();
        Rupees rupeesObj1 = new Rupees(2);
        Rupees rupeesObj2 = new Rupees(5);
        assertEquals(new Rupees(7),rupee.getTotalRupees(rupeesObj1,rupeesObj2));
    }

}
