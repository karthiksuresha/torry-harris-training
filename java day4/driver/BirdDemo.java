package com.Day4.driver;

import com.Day4.model.Bird;
import com.Day4.model.Peacock;
import com.Day4.model.Pigeon;

public class BirdDemo {
    public static void main(String[] args) {

        Bird peacock = new Peacock();
        peacock.fly();
        peacock.eat();

        Bird pigeon = new Pigeon();
        pigeon.fly();
        pigeon.eat();
    }
}
