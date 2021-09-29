package com.Day8.collactions;

import com.Day8.comparator.PersonCityComparator;
import com.Day8.comparator.PersonNameComparator;
import com.Day8.model.Person;

import java.util.TreeSet;

public class PersonTreeSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person(1003,"Ram","Business","Bengaluru");
        Person p2 = new Person(1001,"Alex","Business","Bengaluru");
        Person p3 = new Person(1004,"Raman","Former","Mangaluru");
        Person p4 = new Person(1005,"Karna","ASE","Hassan");
        Person p5 = new Person(1002,"Anthony","Teacher","Chennai");

        TreeSet<Person> people = new TreeSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        System.out.println("--------After sorting by Person ID------\n");
        for(Person person:people)
        {
            System.out.println(person);
        }
        System.out.println("\n--------After sorting by p2------\n");
        people.remove(p2);
        for(Person person:people)
        {
            System.out.println(person);
        }

        TreeSet<Person> treeSetByName = new TreeSet<>(new PersonNameComparator());
        treeSetByName.add(p1);
        treeSetByName.add(p2);
        treeSetByName.add(p3);
        treeSetByName.add(p4);
        treeSetByName.add(p5);

        System.out.println("\n-------After sorting by Person Name-------\n");
        for(Person person:treeSetByName)
        {
            System.out.println(person);
        }
        TreeSet<Person> treeSetByCity = new TreeSet<>(new PersonCityComparator());
        treeSetByCity.add(p1);
        treeSetByCity.add(p2);
        treeSetByCity.add(p3);
        treeSetByCity.add(p4);
        treeSetByCity.add(p5);

        System.out.println("\n-------After sorting by Person City-------\n");
        for(Person person:treeSetByCity)
        {
            System.out.println(person);
        }
    }
}
