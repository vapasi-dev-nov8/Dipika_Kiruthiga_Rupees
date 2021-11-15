package com.currency;

public class Rupees {
    int firstRupeeValue;
    int secondRupeeValue;

    public Rupees(int firstRupeeValue, int secondRupeeValue) {
        this.firstRupeeValue = firstRupeeValue;
        this.secondRupeeValue = secondRupeeValue;
    }

    public boolean compareRupees() {
        if (firstRupeeValue == secondRupeeValue) return true;
        else return false;
    }

    public int getTotalRupees() {
        return firstRupeeValue + secondRupeeValue;
    }
}
