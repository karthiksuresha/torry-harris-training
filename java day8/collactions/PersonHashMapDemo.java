package com.Day8.collactions;

import com.Day8.model.Person;

import java.util.HashMap;

public class PersonHashMapDemo {
    public static void main(String[] args) {
        Person p1 = new Person(1003,"Ram","Business","Bengaluru");
        Person p2 = new Person(1001,"Alex","Business","Bengaluru");
        Person p3 = new Person(1004,"Raman","Former","Mangaluru");
        Person p4 = new Person(1005,"Karna","ASE","Hassan");
        Person p5 = new Person(1002,"Anthony","Teacher","Chennai");

        HashMap<Person,Integer> personHashMap = new HashMap<>();
        personHashMap.put(p1,p1.getPersonID());
        personHashMap.put(p2,p2.getPersonID());
        personHashMap.put(p3,p3.getPersonID());
        personHashMap.put(p4,p5.getPersonID());
        personHashMap.put(p5,p5.getPersonID());

        for(Person person: personHashMap.keySet())
        {
            System.out.println("Key: "+person+" value is: "+personHashMap.get(person));
        }
    }
}
