package com.torryharris;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int decimalNumber = 0, i = 0;
        long remainder;
        int n=num;
        while (n != 0) {
            remainder = n % 10;
            n /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        System.out.println(+num+" in Decimal is: "+decimalNumber);
    }
}
