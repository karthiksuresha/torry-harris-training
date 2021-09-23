package com.Day4.model;

public abstract class Shape {
    private int noOfSide;

    public abstract void area();

    public int getNoOfSide() {
        return noOfSide;
    }

    public void setNoOfSide(int noOfSide) {
        this.noOfSide = noOfSide;
    }
}
