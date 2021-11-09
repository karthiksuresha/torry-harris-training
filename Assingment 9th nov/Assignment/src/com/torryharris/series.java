package com.torryharris;

import java.util.Scanner;

public class series {
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int previousNumber=0;
        int nextNumber=1;

        for (int sum = 0; sum <= n;sum = previousNumber + nextNumber)
        {
            System.out.print(+sum+" ");
            previousNumber=nextNumber;
            nextNumber=sum;
        }


    }
}
