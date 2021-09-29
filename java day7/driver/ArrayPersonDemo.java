package com.Day7.driver;


import com.Day7.comparator.PersonNameComparator;
import com.Day7.model.Employee;
import com.Day7.model.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayPersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person(123456789012l, "Ram", "Karnataka", "ASE");
        Person p2 = new Person(124321789101l, "Alex", "Kerala", "Former");
        Person p3 = new Person(123637828201l, "Rama", "Tamil Nadu", "MGR");
        Person p4 = new Person(187364786254l, "Karan", "Karnataka", "CEO");

        ArrayList<Person> person = new ArrayList<>();
        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);

        Iterator<Person> personIterator = person.iterator();
        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
        System.out.println("\n---------After sorting by AadharNumber---------");

        person.sort(null);
        personIterator = person.iterator();
        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
        System.out.println("\n---------After sorting by Name---------");

        person.sort(new PersonNameComparator());
        personIterator = person.iterator();
        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
    }
}
