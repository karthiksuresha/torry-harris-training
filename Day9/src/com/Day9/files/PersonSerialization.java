package com.Day9.files;

import com.Day9.model.Person;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class PersonSerialization {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person(1001,"Ram",30,"Bengaluru");
        Person p2 = new Person(1003,"Alex",35,"Chennai");
        Person p3 = new Person(1004,"Amar",29,"Mysuru");
        Person p4 = new Person(1002,"Karna",32,"Hassan");

        FileOutputStream fos = new FileOutputStream("people.txt");

        ObjectOutputStream personOutputStream = new ObjectOutputStream(fos);
        personOutputStream.writeObject(p1);
        personOutputStream.writeObject(p2);
        personOutputStream.writeObject(p3);
        personOutputStream.writeObject(p4);

        personOutputStream.flush();
        personOutputStream.close();
        fos.close();
    }
}

