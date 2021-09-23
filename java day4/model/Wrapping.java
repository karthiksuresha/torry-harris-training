package com.Day4.model;

import java.util.Scanner;

public class Wrapping {
    public static void main(String[] args) {
        String str="12345";
        System.out.println(str+10);

        int number = Integer.parseInt(str);
        System.out.println(number+10);

        int a=123;
        Integer iobj = a;
        System.out.println("iobj: "+iobj);
        int b= iobj;
        System.out.println("b: "+b);
        Integer c=iobj+10;
        System.out.println("c: "+c);

        int d=5;
        int e=10;
        Integer iobj0 = d;
        Integer iobj1 = e;
        int f=(iobj0 + iobj1);
        System.out.println("sum= "+f);
        c = (iobj1 - iobj0);
        System.out.println("dif= "+f);
        c = (iobj0 * iobj1);
        System.out.println("mul= "+f);
        c = (iobj1 / iobj0);
        System.out.println("sum= "+f);


            String str0;
            System.out.println("enter the ineger string");
            Scanner scan = new Scanner(System.in);
            str0=scan.nextLine();

            String str1;
            System.out.println("enter the float string");
            Scanner scan1 = new Scanner(System.in);
            str1=scan.nextLine();

            int number0 = Integer.parseInt(str0);
            System.out.println(number0*2);

            float number1 = Float.parseFloat(str1);
            System.out.println(number1*2);

    }
}
