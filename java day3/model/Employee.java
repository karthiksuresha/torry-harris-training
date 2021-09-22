package com.torryharris.model;

public class Employee {
    private String name;
    private int empID;
    private String designation;
    private float salary;

    public Employee(String name, int empID, String designation, float salary) {
        this.name = name;
        this.empID = empID;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void display()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+empID);
        System.out.println("Designation: "+designation);
        System.out.println("salary: "+salary);
        System.out.println();
    }

    @Override
    public String toString() {
        return
                "\nname='" + name + '\'' +
                ", \nempID=" + empID +
                ", \ndesignation='" + designation + '\'' +
                ", \nsalary=" + salary ;
    }
}
