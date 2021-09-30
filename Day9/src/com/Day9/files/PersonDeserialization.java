package com.Day9.files;


import com.Day9.model.Person;

import java.io.*;
import java.util.ArrayList;


public class PersonDeserialization {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("people.txt");
        ObjectInputStream personInputStream = new ObjectInputStream(fis);

        ArrayList<Person> personArrayList = new ArrayList<>();
        Person people;
        System.out.println("People details from the file:");

        try {
            while (true) {
                people = (Person) personInputStream.readObject();
                personArrayList.add(people);
            }
        } catch (EOFException |
                ClassNotFoundException ex) {

        }
        System.out.println("people details:");
        for (Person p : personArrayList) {
            System.out.println(p);
        }
        System.out.println("\nAfter sorting\n");
        personArrayList.sort(null);
        for (Person p : personArrayList) {
            System.out.println(p);
        }
    }
}
