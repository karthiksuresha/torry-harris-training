package com.Day8.comparator;

import com.Day8.model.Person;

import java.util.Comparator;

public class PersonCityComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
