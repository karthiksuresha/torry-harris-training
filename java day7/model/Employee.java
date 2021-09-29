package com.Day7.model;

public class Employee implements Comparable <Employee>{
    private int empID;
    private String empName;
    private String designation;
    private int salary;
    private int balanceCL;

    public Employee() {
    }

    @Override
    public int compareTo(Employee o) {
        return this.empID-o.empID;
    }

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

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", balanceCL=" + balanceCL +
                '}';
    }
}
