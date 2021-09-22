package com.torryharris.model;

public class Lead extends Employee{
    int teamSize;

    public Lead(String name, int empID, String designation, float salary, int teamSize) {
        super(name, empID, designation, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "\nLead{" +super.toString()+
                ", \nteamSize=" + teamSize +
                '}';
    }
    public void standUpCall()
    {
        System.out.println("Lead "+getName()+" has called for standUp call");
    }
}
