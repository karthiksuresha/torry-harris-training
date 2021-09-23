package com.Day4.driver;

import com.Day4.model.*;

public class MammalDemo {
    public static void main(String[] args) {

        Mammal cow = new Cow();
        cow.feed();
        cow.eat();

        Mammal tiger = new Tiger();
        tiger.feed();
        tiger.eat();

        Bat bat = new Bat();
        bat.fly();
        bat.eat();
        bat.feed();
    }
}

