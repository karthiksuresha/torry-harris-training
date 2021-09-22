package com.torryharris.model;

public class Manager extends Employee {
       private String projectName;
        int noOfTeams;

    public Manager(String name, int empID, String designation, float salary, String projectName, int noOfTeams) {
        super(name, empID, designation, salary);
        this.projectName = projectName;
        this.noOfTeams = noOfTeams;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getNoOfTeams() {
        return noOfTeams;
    }

    public void setNoOfTeams(int noOfTeams) {
        this.noOfTeams = noOfTeams;
    }

    @Override
    public String toString() {
        return "\nManager{" +super.toString()+
                ", \nprojectName='" + projectName + '\'' +
                ", \nnoOfTeams=" + noOfTeams +
                '}';
    }
    public void callMeeting()
    {
        System.out.println("Manager "+getName()+" has called for meeting");
    }
}

