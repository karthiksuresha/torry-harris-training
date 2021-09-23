package com.Day4.model;

import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) {
        try
        {
            readFromFile("input.txt");
        }catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }

    private static void readFromFile() {
        
    }
}
