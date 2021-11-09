package com.torryharris;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;
        int n=num;
        while (n!=0) {
            remainder = n % 2;
            n /= 2;

            binaryNumber += remainder * i;
            i *= 10;
        }
        System.out.println(+num+" in Binary is: "+binaryNumber);
    }

}
