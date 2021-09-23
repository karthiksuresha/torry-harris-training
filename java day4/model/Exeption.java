package com.Day4.model;

public class Exeption extends Throwable {
    public static void main(String[] args) {

        try {
            System.out.println("Hello");
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException ex) {
            System.out.println("Exeption Cought");
            ex.printStackTrace();

            try {
                int[] array = new int[4];
                array[4] = 10;
            } catch (ArrayIndexOutOfBoundsException ex2) {
                ex2.printStackTrace();
            }
            try {
                int a = 3, b = 0;
                int c = a / b;
            }catch (ArithmeticException ex1) {
                ex1.printStackTrace();
            }
            System.out.println("END");
        }
    }
}
