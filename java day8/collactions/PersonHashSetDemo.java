package com.Day8.collactions;

import com.Day8.model.Person;

import java.util.HashSet;
import java.util.TreeSet;

public class PersonHashSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person(1003,"Ram","Business","Bengaluru");
        Person p2 = new Person(1001,"Alex","Business","Bengaluru");
        Person p3 = new Person(1004,"Raman","Former","Mangaluru");
        Person p4 = new Person(1005,"Karna","ASE","Hassan");
        Person p5 = new Person(1002,"Anthony","Teacher","Chennai");

        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(p1);
        personHashSet.add(p2);
        personHashSet.add(p3);
        personHashSet.add(p4);
        personHashSet.add(p5);

        for(Person person:personHashSet)
        {
            System.out.println(person);
        }
    }
}
