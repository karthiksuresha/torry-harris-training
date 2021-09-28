package com.day6.driver;

import com.day6.model.GenericPrint;

public class GenericDemo {
    public static void main(String[] args) {
        GenericPrint<Integer>iprint = new GenericPrint<>(10);
        System.out.println(iprint.getObj());
    }
}
