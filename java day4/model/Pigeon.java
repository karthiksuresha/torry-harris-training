package com.Day4.model;

public class Pigeon implements Bird{


    @Override
    public void fly() {
        System.out.println("Pigeon is Flying Higher");
    }

    @Override
    public void eat() {
        System.out.println("pigeon is Eating grains");

    }
}
