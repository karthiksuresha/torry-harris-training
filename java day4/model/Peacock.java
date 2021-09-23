package com.Day4.model;

public class Peacock implements Bird{

    @Override
    public void fly() {
        System.out.println("Peacock is Flying Lower");
    }

    @Override
    public void eat() {
        System.out.println("Peacock is Eating Insects");
    }
}
