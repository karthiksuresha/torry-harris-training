package com.Day4.model;

public class Cow implements Mammal{

    @Override
    public void feed() {
        System.out.println("Cow is feeding to his Calf");
    }

    @Override
    public void eat() {
        System.out.println("Calf is eating grss");
    }
}
