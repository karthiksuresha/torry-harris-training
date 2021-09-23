package com.Day4.driver;

import com.Day4.model.*;

public class VehicleDemo {
    public static void main(String[] args) {

        Car swift =new Swift();
        swift.move();
        swift.changeGear();

        Boat titanic = new Titanic();
        titanic.move();
        titanic.bfloat();

        Airplane airplane =new AirIndia();
        airplane.move();
        airplane.fly();
    }
}
