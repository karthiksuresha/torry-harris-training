package com.torryharris.model;

public class HatchBack extends Car {
    String SteeringType;

    public HatchBack(String name, String fuelType, int engineCapacity, double power, int noOfgears, Tyre tyre, MusicSystem musicsystem, String steeringType) {
        super(name, fuelType, engineCapacity, power, noOfgears, tyre, musicsystem);
        SteeringType = steeringType;
    }


    public String getSteeringType() {
        return SteeringType;
    }

    public void setSteeringType(String steeringType) {
        SteeringType = steeringType;
    }
    public void displayHatchBackFeatures()
    {
        displayFeatures();
        System.out.println("Steering Type: "+getSteeringType());
        System.out.println();
    }
}