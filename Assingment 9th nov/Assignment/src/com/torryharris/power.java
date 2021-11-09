package com.torryharris;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {

        System.out.println("Enter the X in decimal:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the N in binary:");
        int n = sc.nextInt();

        int decimalNumber = 0, i = 0;
        long remainder;
        int num=n;
        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        int sum=1;
        for(int j=0;j<decimalNumber;j++)
        {
            sum *= x;
        }
        System.out.println(+x+" power "+decimalNumber+" is: "+sum);
    }
}
