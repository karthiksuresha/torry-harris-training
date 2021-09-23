package com.Day4.model;

import java.util.Scanner;

public class ManualThrow {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        b=scanner.nextInt();
        c=scanner.nextInt();

        try{
            if(c==0)
            {
                throw new ArithmeticException("Custom Message: Deviding by Zero");
            }
            else
            {
                a=b/c;
            }
        }catch (ArithmeticException ex)
        {
            System.out.println("Exception caught");
            System.out.println(ex);
        }
        System.out.println("After if-else statement");
    }
}
