package com.torryharris;

import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number to check:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci_num_check(n) ? n + " is a Fibonacci number" :
                                                    n + " is a not Fibonacci number");
        }
    static boolean fibonacci_num_check(int n)
    {
        return perfect_square_check(5*n*n + 4) || perfect_square_check(5*n*n - 4);
    }
    static boolean perfect_square_check(int val)
    {
        int s = (int) Math.sqrt(val);
        return (s*s == val);
    }
}