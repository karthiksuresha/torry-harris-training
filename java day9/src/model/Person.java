package com.Day9.model;

import java.io.Serializable;

public class Person implements Serializable,Comparable<Person> {
    private static final long SerialVersionUID = 101l;

    Integer personId;
    String name;
    int age;
    String city;

    public Person() {
    }

    @Override
    public int compareTo(Person o) {
        return this.personId-o.personId;
    }

    public Person(int personId, String name, int age, String city) {
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
    }
