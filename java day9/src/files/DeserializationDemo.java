package com.Day9.files;

import com.Day9.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("employee.txt");
        ObjectInputStream employeeInputStream = new ObjectInputStream(fis);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Employee employee;
        System.out.println("Employee details from the file:");

        try{
            while(true)
            {
                employee = (Employee) employeeInputStream.readObject();
                employeeArrayList.add(employee);
            }
        }catch (EOFException | ClassNotFoundException ex) {

        }
        System.out.println("Employee details:");
        for(Employee emp:employeeArrayList)
        {
            System.out.println(emp);
        }
    }
}
