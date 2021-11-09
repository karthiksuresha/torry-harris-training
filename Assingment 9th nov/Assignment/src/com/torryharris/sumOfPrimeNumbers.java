package com.torryharris;

import java.util.Scanner;

public class sumOfPrimeNumbers {
    public static void main(String[] args) {

        System.out.println("Enter the range:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int count, sum = 0;
        for (int i = num1; i <= num2; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("The Sum of Prime Numbers from "+num1+" to "+num2+" is: "+ sum);
    }
}
