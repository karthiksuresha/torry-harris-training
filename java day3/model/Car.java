package com.torryharris.model;
public class Car {
    private String name;
    private String fuelType;
    private int engineCapacity;
    private double power;
    private int noOfgears;
    private Tyre tyre;
    private MusicSystem Musicsystem;

    public Car() {
    }

    public Car(String name, String fuelType, int engineCapacity, double power, int noOfgears, Tyre tyre, MusicSystem musicsystem) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.noOfgears = noOfgears;
        this.tyre = tyre;
        Musicsystem = musicsystem;
    }

    public String getName() {
        return name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public double getPower() {
        return power;
    }

    public int getNoOfgears() {
        return noOfgears;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public MusicSystem getMusicsystem() {
        return Musicsystem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void setNoOfgears(int noOfgears) {
        this.noOfgears = noOfgears;
    }

    public void setMusicsystem(MusicSystem musicsystem) {
        Musicsystem = musicsystem;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void accelerate()
    {
        System.out.println(name+" car is accelerating..");
    }
    public void applyBrake()
    {
        System.out.println(name+" car is slowing/stopping");
    }
    public void changeGear()
    {
       /* System.out.println("enter the Gear: ");
        int n;
        Scanner scan =new Scanner (System.in);
        n = scan.nextInt();
        if(n<=getNoOfgears()) {*/
            System.out.println(name + " car is changing gear");
        /*}
        else
        {
            System.out.println("Entered a wrong Gear no");
        }*/
    }
    public void steer()
    {
        System.out.println(name+" car is changing directions");
    }
    public void displayFeatures()
    {
        System.out.println("Features of "+name+" Car:");
        System.out.println("-------------------------");
        System.out.println("Engine Capacity: "+engineCapacity+" CC");
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("Power: "+power+" BHP");
        System.out.println("No of Gears: "+noOfgears);
        System.out.println("Tyre Name: "+tyre.getTyreName()+"\nSize "+tyre.getSie()+" inch");
        System.out.println("Music System Name: "+Musicsystem.getName()+"\nNo of speakers are: "+Musicsystem.getNoOfSpeakers()+
                "\nSubwoofer: "+Musicsystem.isSubwoofer()+"\nLCD screen size "+Musicsystem.getLCDScreenSize()+" Inch");
        System.out.println();
    }
}
