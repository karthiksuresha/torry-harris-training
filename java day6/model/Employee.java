package com.day6.model;

public class Employee {
    private int empID;
    private String empName;
    private String designation;
    private int salary;
    private int balanceCL;

    public Employee(int empID, String empName, String designation, int salary) {
        this.empID = empID;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
        balanceCL=12;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalanceCL() {
        return balanceCL;
    }

    public void setBalanceCL(int balanceCL) {
        this.balanceCL = balanceCL;
    }
}
