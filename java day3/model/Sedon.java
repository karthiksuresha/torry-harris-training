package com.torryharris.model;

public class Sedon extends Car {
    int bootSpace;

    public Sedon(String name, String fuelType, int engineCapacity, double power, int noOfgears, Tyre tyre, MusicSystem musicsystem, int bootSpace) {
        super(name, fuelType, engineCapacity, power, noOfgears, tyre, musicsystem);
        this.bootSpace = bootSpace;
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }

    public void displaySedonFeatures() {
        displayFeatures();
        System.out.println("Boot Space: " + getBootSpace()+" L");
        System.out.println();
    }
}

