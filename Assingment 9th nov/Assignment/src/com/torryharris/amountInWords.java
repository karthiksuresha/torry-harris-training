package com.torryharris;

import java.util.Scanner;

public class amountInWords {
    public static void main(String[] args) {

        System.out.println("Enter the amount:");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int n = amount;
        if (amount <= 0) {
            System.out.println("Zero Only");
        } else {

            String one[] = {" ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
                    " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
                    " Nineteen"};

            String ten[] = {" ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety"};

            while(n != 0) {
                if (n > 9999999) {
                    System.out.print(one[n / 10000000] + " crore");
                    n %= 10000000;
                }else if (n > 999999) {
                    System.out.print(ten[n / 1000000] + "-");
                    n %= 1000000;
                }else if (n > 99999) {
                    System.out.print(one[n / 100000] + " lack");
                    n %= 100000;
                } else if (n > 9999) {
                    System.out.print(ten[n / 10000] + "-");
                    n %= 10000;
                } else if (n > 999) {
                    System.out.print(one[n / 1000] + " thousand");
                    n %= 1000;
                } else if (n > 99) {
                    System.out.print(one[n / 100] + " hundred ");
                    n %= 100;
                } else if (n > 19) {
                    System.out.print(ten[n / 10] + " " + one[n % 10]+" only.");
                    n=0;
                } else {
                    System.out.print(one[n]+" only.");
                    n=0;
                }
            }
        }
    }
}
