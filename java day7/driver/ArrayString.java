package com.Day7.driver;

import com.Day7.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayString {
    public static void main(String[] args) {
        ArrayList<String>stringList = new ArrayList<>();
        stringList.add("Karthik");
        stringList.add("Ram");
        stringList.add("Alex");

        System.out.println(stringList);

        ArrayList<Integer>integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);

        System.out.println(integerList);

        ArrayList<Float>floatList = new ArrayList<>();
        floatList.add(1.23f);
        floatList.add(3.87f);
        floatList.add(6.54f);

        System.out.println(floatList);

        ArrayList<Employee>empList = new ArrayList<>();
        Employee e1 = new Employee(0001,"Ram","MGR",50000);
        Employee e2 = new Employee(0002,"Alex","HR",35000);
        Employee e3 = new Employee(0003,"Antony","Lead",40000);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        Iterator<Employee>empIterator = empList.iterator();

        while (empIterator.hasNext())
        {
            System.out.println(empIterator.next());
        }
    }
}
