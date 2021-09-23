package com.Day4.model;

public class Bat implements Mammal,Bird{
    @Override
    public void fly() {
        System.out.println("Bat i sFlying in the Caves");
    }

    @Override
    public void feed() {
        System.out.println("Bat is Feeding his Child");
    }

    @Override
    public void eat() {
        System.out.println("Bat is Eating Fruits/Insects");
    }
}
