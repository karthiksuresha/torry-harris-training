package com.torryharris.model;

public class Clerk extends Employee{
    String digree;

    public Clerk(String name, int empID, String designation, float salary, String digree) {
        super(name, empID, designation, salary);
        this.digree = digree;
    }

    public String getDigree() {
        return digree;
    }

    public void setDigree(String digree) {
        this.digree = digree;
    }

    @Override
    public String toString() {
        return "\nClerk{" +super.toString()+
                ", \ndigree='" + digree + '\'' +
                '}';
    }
    public void generatePayRoll()
    {
        System.out.println("Clerk "+getName()+" has generated a Pay Roll for all the Employees");
    }
}
