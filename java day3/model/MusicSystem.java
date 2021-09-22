package com.torryharris.model;
public class MusicSystem {
    private String name;
    private int noOfSpeakers;
    private boolean subwoofer;
    private float LCDScreenSize;

    public MusicSystem(String name, int noOfSpeakers, boolean subwoofer, float LCDScreenSize) {
        this.name = name;
        this.noOfSpeakers = noOfSpeakers;
        this.subwoofer = subwoofer;
        this.LCDScreenSize = LCDScreenSize;
    }

    public String getName() {
        return name;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public boolean isSubwoofer() {
        return subwoofer;
    }

    public float getLCDScreenSize() {
        return LCDScreenSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public void setSubwoofer(boolean subwoofer) {
        this.subwoofer = subwoofer;
    }

    public void setLCDScreenSize(float LCDScreenSize) {
        this.LCDScreenSize = LCDScreenSize;
    }
}
