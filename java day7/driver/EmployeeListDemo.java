package com.Day7.driver;

import com.Day7.comparator.EmployeeNameComparator;
import com.Day7.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeListDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee(1001,"Ram","MGR",50000);
        Employee e2 = new Employee(1002,"Alex","HR",35000);
        Employee e3 = new Employee(1005,"Antony","Lead",40000);
        Employee e4 = new Employee(1004,"Shyam","AC",40000);
        Employee e5 = new Employee(1003,"Rama","Clerk",30000);

        ArrayList<Employee> empList = new ArrayList<>();
        if(empList.isEmpty());
        {
            System.out.println("Employee list is empty");
        }
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        Iterator<Employee> empIterator = empList.iterator();
        while (empIterator.hasNext())
        {
            System.out.println(empIterator.next());
    }
        System.out.println("\n---------After sorting by EmpID---------\n");

        empList.sort(null);
        empIterator = empList.iterator();
        while (empIterator.hasNext())
        {
            System.out.println(empIterator.next());
        }
        System.out.println("\n---------After sorting by EmpName---------\n");

        empList.sort(new EmployeeNameComparator());
        empIterator = empList.iterator();
        while (empIterator.hasNext())
        {
            System.out.println(empIterator.next());
        }
}
}
