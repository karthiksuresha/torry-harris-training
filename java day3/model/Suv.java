package com.torryharris.model;

public class Suv extends Car {
    String driveMode;
    boolean sunRoof;

    public Suv(String name, String fuelType, int engineCapacity, double power, int noOfgears, Tyre tyre, MusicSystem musicsystem, String driveMode, boolean sunRoof) {
        super(name, fuelType, engineCapacity, power, noOfgears, tyre, musicsystem);
        this.driveMode = driveMode;
        this.sunRoof = sunRoof;
    }

    public String getDriveMode() {
        return driveMode;
    }

    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    public void displaySuvFeatures() {
        displayFeatures();
        System.out.println("Drive mode: " + getDriveMode() + "\nSunRoof: " + isSunRoof());
        System.out.println();
    }
}
