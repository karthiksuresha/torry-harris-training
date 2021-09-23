package com.Day4.model;

public class Swift implements Car{

    @Override
    public void changeGear() {
        System.out.println("Car Swift is changing the Gear");
    }

    @Override
    public void move() {
        System.out.println("Car Swift is moving");
    }
}
