package com.Day4.model;

public class AirIndia implements Airplane{
    @Override
    public void fly() {
        System.out.println("Airplane is flying on the sky");
    }

    @Override
    public void move() {
        System.out.println("Airplane is moving");
    }
}
