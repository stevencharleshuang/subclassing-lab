package com.company;

public class Reptile extends Animal {
    private boolean isVenomous;

    public Reptile(int topSpeed, boolean isEndangered, String name, boolean isVenomous) {
        super(topSpeed, isEndangered, name);
        this.isVenomous = isVenomous;
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }
}
