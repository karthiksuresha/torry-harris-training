package com.Day9.files;

import com.Day9.model.Employee;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Employee e1 = new Employee(1001,"Ram","Manager",50000);
        Employee e2 = new Employee(1002,"Amar","Lead",40000);
        Employee e3 = new Employee(1003,"Alex","HR",30000);

        FileOutputStream fos = new FileOutputStream("employee.txt");

        ObjectOutputStream employeeOutputStream = new ObjectOutputStream(fos);
        employeeOutputStream.writeObject(e1);
        employeeOutputStream.writeObject(e2);
        employeeOutputStream.writeObject(e3);

        employeeOutputStream.flush();
        employeeOutputStream.close();
        fos.close();

    }
}
