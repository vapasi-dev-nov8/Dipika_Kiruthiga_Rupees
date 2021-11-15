package com.currency;

import java.util.Objects;

public class Rupees {
    int rupeeValue;

    public Rupees(int rupee) {
        this.rupeeValue=rupee;
    }

    public Rupees() {}

    public Rupees getTotalRupees(Rupees obj1,Rupees obj2) {
        return new Rupees(obj1.rupeeValue + obj2.rupeeValue);
    }

    @Override
    public boolean equals(Object thatRupeeObject) {
        if (this == thatRupeeObject) return true;
        if (thatRupeeObject == null || getClass() != thatRupeeObject.getClass()) return false;
        Rupees rupees = (Rupees) thatRupeeObject;
        return rupeeValue == rupees.rupeeValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rupeeValue);
    }
}
