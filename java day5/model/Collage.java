package com.Day4.model;

public class Collage {
    private String name;
    private String  id;
    private String place;

    public Collage(String name, String id, String place) {
        this.name = name;
        this.id = id;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return
                "\nname='" + name + '\'' +
                ",\nid=" + id +
                ",\nplace='" + place + '\'';
    }
}
