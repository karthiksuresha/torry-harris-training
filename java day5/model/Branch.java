package com.Day4.model;

public class Branch extends Collage{
    private String branchName;
    private String branchID;

    public Branch(String name, String id, String place, String branchName, String branchID) {
        super(name, id, place);
        this.branchName = branchName;
        this.branchID = branchID;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    @Override
    public String toString() {
        return
                "\nbranchName='" + branchName + '\'' +
                ",\nbranchID=" + branchID +
                super.toString();
    }
}
