package com.Day4.driver;

import com.Day4.model.Rectangle;
import com.Day4.model.Shape;
import com.Day4.model.Triangle;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Triangle(10,20);
        shape.area();

        shape = new Rectangle(10,20);
        shape.area();
    }
}
