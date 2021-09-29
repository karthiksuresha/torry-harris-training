package com.Day8.model;

public class Person implements Comparable<Person>{
    int personID;
    String name;
    String occupation;
    String city;

    public Person() {
    }

    @Override
    public int compareTo(Person o) {
        return this.personID-o.personID;
    }

    public Person(int personID, String name, String occupation, String city) {
        this.personID = personID;
        this.name = name;
        this.occupation = occupation;
        this.city = city;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
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
                "personID=" + personID +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}
